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

	web_set_sockets_option("SSL_VERSION", "TLS1.1");

	lr_think_time(4);

	lr_start_transaction("login_transaction");

	web_submit_form("login.pl", 
		"Snapshot=t2.inf", 
		ITEMDATA, 
		"Name=username", "Value=jojo", ENDITEM, 
		"Name=password", "Value=0920", ENDITEM, 
		"Name=login.x", "Value=28", ENDITEM, 
		"Name=login.y", "Value=9", ENDITEM, 
		LAST);

	return 0;
}