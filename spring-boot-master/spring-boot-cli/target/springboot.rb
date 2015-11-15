require 'formula'

class Springboot < Formula
  homepage 'http://projects.spring.io/spring-boot/'
  url 'https://repo.spring.io/snapshot/org/springframework/boot/spring-boot-cli/1.2.0.BUILD-SNAPSHOT/spring-boot-cli-1.2.0.BUILD-SNAPSHOT-bin.tar.gz'
  version '1.2.0.BUILD-SNAPSHOT'
  sha1 'b64b4fc1857b77539cf078c9b26c53e6492c7146'
  head 'https://github.com/spring-projects/spring-boot.git'

  if build.head?
    depends_on 'maven' => :build
  end

  def install
    if build.head?
      Dir.chdir('spring-boot-cli') { system 'mvn -U -DskipTests=true package' }
      root = 'spring-boot-cli/target/spring-boot-cli-*-bin/spring-*'
    else
      root = '.'
    end

    bin.install Dir["#{root}/bin/spring"]
    lib.install Dir["#{root}/lib/spring-boot-cli-*.jar"]
    bash_completion.install Dir["#{root}/shell-completion/bash/spring"]
    zsh_completion.install Dir["#{root}/shell-completion/zsh/_spring"]
  end
end
