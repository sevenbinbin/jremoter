package com.jremoter.core.bean.support;

import com.jremoter.core.bean.BeanContainerHandler;
import com.jremoter.core.bean.BeanContainerHandlerChain;
import com.jremoter.core.handler.HandlerContext;
import com.jremoter.core.handler.support.AbstractHandlerChain;

public class DefaultBeanContainerHandlerChain extends AbstractHandlerChain<BeanContainerHandler> implements BeanContainerHandlerChain{

	@Override
	protected HandlerContext<BeanContainerHandler> createHeadHandlerContext(){
		return new DefaultBeanContainerHandlerHead(this);
	}

	@Override
	protected HandlerContext<BeanContainerHandler> createFootHandlerContext(){
		return new DefaultBeanContainerHandlerFoot(this);
	}
	
	@Override
	protected HandlerContext<BeanContainerHandler> createHandlerContext(String name, BeanContainerHandler handler){
		return new DefaultBeanContainerHandlerContext(this,name,handler);
	}
	
}