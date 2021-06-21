Action()
{

	web_add_cookie("SRCHUID=V=2&GUID=A101128D55A54094ACA11B65C6221DE7&dmnchg=1; DOMAIN=c.urs.microsoft.com");

	web_add_cookie("AMCV_EA76ADE95776D2EC7F000101%40AdobeOrg=-1303530583%7CMCIDTS%7C18664%7CMCMID%7C17692424206641163082184187489275676684%7CMCAAMLH-1613100893%7C11%7CMCAAMB-1613100893%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1612503293s%7CNONE%7CMCAID%7CNONE%7CMCSYNCSOP%7C411-18671%7CvVersion%7C3.3.0; DOMAIN=c.urs.microsoft.com");

	web_add_cookie("SRCHD=AF=NOFORM; DOMAIN=c.urs.microsoft.com");

	web_add_cookie("_EDGE_V=1; DOMAIN=c.urs.microsoft.com");

	web_add_cookie("MUID=1016D13BAF6B62600F9CC13FAE14632C; DOMAIN=c.urs.microsoft.com");

	web_add_cookie("mbox=session#ef8853e0a32e4c03b622cb01c257be85#1612497952|PC#ef8853e0a32e4c03b622cb01c257be85.38_0#1675740894; DOMAIN=c.urs.microsoft.com");

	web_add_cookie("SRCHUSR=DOB=20210324; DOMAIN=c.urs.microsoft.com");

	web_add_cookie("SRCHHPGUSR=SRCHLANGV2=zh-Hans; DOMAIN=c.urs.microsoft.com");

	web_url("WebTours", 
		"URL=http://127.0.0.1:1080/WebTours/", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://c.urs.microsoft.com/l1.dat?v=3&cv=9.11.19041.0&os=10.0.19042.0.0&pg=4A72F430-B40C-4D36-A068-CE33ADA5ADF9", "Referer=", ENDITEM, 
		LAST);

	web_set_sockets_option("SSL_VERSION", "TLS1.1");

	lr_think_time(21);
	
	lr_rendezvous("login_zvous");

	lr_start_transaction("login");

	web_submit_form("login.pl", 
		"Snapshot=t2.inf", 
		ITEMDATA, 
		"Name=username", "Value=jojo", ENDITEM, 
		"Name=password", "Value=bean", ENDITEM, 
		"Name=login.x", "Value=51", ENDITEM, 
		"Name=login.y", "Value=13", ENDITEM, 
		LAST);

	lr_end_transaction("login",LR_AUTO);

	return 0;
}