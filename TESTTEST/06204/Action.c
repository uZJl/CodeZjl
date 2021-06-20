Action()
{

	web_url("WebTours", 
		"URL=http://127.0.0.1:1080/WebTours/", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=http://config.pinyin.sogou.com/api/toolbox/geturl.php?h=EE87B9689F789C6B0D845A32D1BAABFA&v=10.3.0.4581&r=0000_sogou_pinyin_103a", "Referer=", ENDITEM, 
		LAST);

	lr_rendezvous("login_zvous");

	lr_think_time(19);

	lr_start_transaction("login_transaction");

	web_submit_form("login.pl", 
		"Snapshot=t2.inf", 
		ITEMDATA, 
		"Name=username", "Value=jojo", ENDITEM, 
		"Name=password", "Value=bean", ENDITEM, 
		"Name=login.x", "Value=16", ENDITEM, 
		"Name=login.y", "Value=5", ENDITEM, 
		LAST);

	lr_end_transaction("login_transaction",LR_AUTO);

	return 0;
}