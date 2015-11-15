<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:loadBundle basename="bundle.messages" var="msg" />

<html>
<head>
<title>enter your name page</title>
</head>
<body>
	<f:view>
		<h1>
			<h:outputText value="#{msg.inputname_header}" />
		</h1>
		<p>
			<h:messages style="color:darkred" />
		</p>
		<h:form id="helloForm">
			<h:outputText value="#{msg.prompt}" />

			<!--  -->

			<h:inputText value="#{personBean.personName}" required="true">
				<f:validateLength minimum="2" maximum="10" />
			</h:inputText>

			<!--  -->
			<h:commandButton action="greeting" value="#{msg.button_text}" />
		</h:form>
	</f:view>
</body>
</html>
