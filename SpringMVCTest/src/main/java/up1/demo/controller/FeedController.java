package up1.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import up1.demo.bean.FeedBean;
import up1.demo.bean.FeedListData;


@Controller
@RequestMapping(value = "/feed")
public class FeedController extends BaseController {
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody
	FeedBean info(@PathVariable int id) throws Exception {
		FeedBean feedBean = new FeedBean();
		feedBean.setTitle("Somkiat");
		return feedBean;
	} 
	
	@RequestMapping(value = {"/check/{email}"}, method = RequestMethod.GET)
	public @ResponseBody
	FeedBean check(@PathVariable String email) throws Exception {
		System.out.println(email);
		FeedBean feedBean = new FeedBean();
		feedBean.setTitle("Somkiat");
		return feedBean;
	} 
	
	
	@RequestMapping( value="/all", method = RequestMethod.GET)
	public @ResponseBody
	FeedListData list() throws Exception {
		FeedBean feedBean = new FeedBean();
		feedBean.setTitle("Somkiat");
		
		List<FeedBean> feedBeanList = new ArrayList<FeedBean>();
		feedBeanList.add(feedBean);
		feedBeanList.add(feedBean);
		feedBeanList.add(feedBean);
		feedBeanList.add(feedBean);
		
		FeedListData resultList = new FeedListData();
		resultList.setFeedBeanList(feedBeanList);
		return resultList;
	} 

}
