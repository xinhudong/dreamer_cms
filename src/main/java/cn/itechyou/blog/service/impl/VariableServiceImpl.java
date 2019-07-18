package cn.itechyou.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.itechyou.blog.common.SearchEntity;
import cn.itechyou.blog.dao.VariableMapper;
import cn.itechyou.blog.entity.Variable;
import cn.itechyou.blog.service.VariableService;

@Service
public class VariableServiceImpl implements VariableService{

	@Autowired
	private VariableMapper variableMapper;
	
	@Override
	public PageInfo<Variable> queryListByPage(SearchEntity params) {
		if(params.getPageNum() == null || params.getPageNum() == 0) {
			params.setPageNum(1);
		}
		if(params.getPageSize() == null || params.getPageSize() == 0) {
			params.setPageSize(10);
		}
		PageHelper.startPage(params.getPageNum(), params.getPageSize());
		List<Variable> list = variableMapper.queryListByPage(params.getEntity());
		PageInfo<Variable> page = new PageInfo<Variable>(list);
		return page;
	}

	@Override
	public void add(Variable variable) {
		variableMapper.insert(variable);
	}

	@Override
	public Variable queryVariableId(String id) {
		return variableMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateVariable(Variable variable) {
		variableMapper.updateByPrimaryKey(variable);		
	}

	@Override
	public void deleteVariable(String id) {
		variableMapper.deleteByPrimaryKey(id);
	}

}
