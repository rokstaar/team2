package com.market.service;

import java.util.List;

import com.market.domain.MemberVO;
import com.market.domain.NoticeVO;
import com.market.domain.ProductVO;

public interface AdminService {
	
	// ȸ����ü��� ��ȸ
	public List<MemberVO> memberList() throws Exception;
	
	// ��ǰ��ü��� ��ȸ
	public List<ProductVO> productList() throws Exception;
	
	// �������� �۾���
	public void writeNotice(NoticeVO vo) throws Exception;
	
	// �������� ��ü��� ��ȸ
	public List<NoticeVO> noticeList() throws Exception;
	
	// �Խ��� �� ��ȸ�� 1����
	public void updateReadCnt(Integer noti_num) throws Exception;
		
	// ������ ��ȸ(Ư����)
	public NoticeVO getBoard(Integer noti_num) throws Exception;
	
	 // ������ ����
    public Integer modifyBoard(NoticeVO uvo) throws Exception;
	
	

}
