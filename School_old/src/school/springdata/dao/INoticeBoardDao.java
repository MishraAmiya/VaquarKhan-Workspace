package school.springdata.dao;

import java.util.List;

import school.notice.NoticeBean;

public interface INoticeBoardDao {
	
	public void insertNotice(final NoticeBean noticeBean);

	public List<NoticeBean> getAllNotice();

	public void updateNotice(final NoticeBean noticeBean);

	public void updateNoticeImage(final NoticeBean noticeBean);

	public void deleteNotice(final NoticeBean noticeBean);
}
