package com.market.persistence;

import java.util.List;

import com.market.domain.MemberVO;
import com.market.domain.NoticeVO;
import com.market.domain.ProductVO;

public interface AdminDAO {
	
	// ��� ȸ��������� ��ȸ
	public List<MemberVO> getMemebrList() throws Exception;
	
	// ��� ��ǰ������� ��ȸ
	public List<ProductVO> getProductList() throws Exception;
	
	// �������� ���
	public void createNotice(NoticeVO vo) throws Exception;
	
	// ��� �������� ��ȸ
	public List<NoticeVO> getNoticeList() throws Exception;
	
	// �� ��ȸ�� 1����
	public void addReadcnt(Integer noti_num) throws Exception;
	
	// Ư�� �������� ��ȸ
	public NoticeVO getNotice(Integer noti_num) throws Exception;
	
	// ������������ ����
	public Integer updateBoard(NoticeVO uvo) throws Exception;
	
	// 

}
