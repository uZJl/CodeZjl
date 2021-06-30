Action()
{

	web_add_cookie("Idea-29faa48e=048d51ff-c7eb-463e-93f7-b5e28a992ef7; DOMAIN=localhost");

	web_url("index.html", 
		"URL=http://localhost:8080/DBed/index.html", 
		"Resource=0", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=image", ENDITEM, 
		"Url=imageShow?imageId=19", ENDITEM, 
		"Url=imageShow?imageId=20", ENDITEM, 
		"Url=imageShow?imageId=22", ENDITEM, 
		"Url=imageShow?imageId=21", ENDITEM, 
		"Url=imageShow?imageId=26", ENDITEM, 
		LAST);

	web_custom_request("json", 
		"URL=http://update.googleapis.com/service/update2/json?cup2key=10:537378060&cup2hreq=381e64ab53edd83ec80fc82c78240bf0a58f60018a6bdc0a3ade8aa214d423ff", 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		"EncType=application/json", 
		"Body={\"request\":{\"@os\":\"win\",\"@updater\":\"chrome\",\"acceptformat\":\"crx2,crx3\",\"app\":[{\"appid\":\"ihnlcenocehgdaegdmhbidjhnhdchfmm\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"ping\":{\"ping_freshness\":\"{6dbac8d6-eb7a-48af-aa74-68de1301ae44}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"0.0.0.0\"},{\"appid\":\"oimompecagnajdejgnnjijobebaeigek\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"ping\":{\"ping_freshness\":\"{a059d40c-8485-4680-89e4-cfd80ecb5ba6"
		"}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"4.10.2209.0\"},{\"appid\":\"gcmjkmgdlgnkkcocmoeiminaijmmjnii\",\"brand\":\"GGLS\",\"cohort\":\"1:bm1:1069@0.01,1089@0.1\",\"cohorthint\":\"M54ToM99\",\"cohortname\":\"M54ToM99\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.91ee417000553ca22ed67530545c4177a08e7ffcf602c292a71bd89ecd0568a5\"}]},\"ping\":{\"ping_freshness\":\"{02bd5cbc-8678-41f5-93b6-79cd059ecdf4}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"9.28.0\"},{\"accept_locale\":"
		"\"ZHCN\",\"appid\":\"obedbbhbpmojnkanicioggnmelmoomoc\",\"brand\":\"GGLS\",\"cohort\":\"1:s6f:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"ping\":{\"ping_freshness\":\"{288d3374-413c-426b-acb1-7c13f88099b1}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"0.0.0.0\"},{\"appid\":\"dhlpobdgcjafebgbbhjdnapejmpkgiie\",\"brand\":\"GGLS\",\"cohort\":\"1:z9x:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\""
		"1.3eeded944371798374de67d1fa7bb8f32f90a7cd502b04ee71e0de0cf79e2a11\"}]},\"ping\":{\"ping_freshness\":\"{e236add2-1676-4191-98f0-d7ce39c05401}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"20210609.1\"},{\"appid\":\"khaoiebndkojlmppeemjhbpbandiljpe\",\"brand\":\"GGLS\",\"cohort\":\"1:cux:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.ffd1d2d75a8183b0a1081bd03a7ce1d140fded7a9fb52cf3ae864cd4d408ceb4\"}]},\"ping\":{\"ping_freshness\":\""
		"{b3cafb90-c7fc-4831-9955-51f12b26ceb8}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"43\"},{\"appid\":\"cmahhnpholdijhjokonmfdjbfmklppij\",\"brand\":\"GGLS\",\"cohort\":\"1:wr3:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.b4ddbdce4f8d5c080328aa34c19cb533f2eedec580b5d97dc14f74935e4756b7\"}]},\"ping\":{\"ping_freshness\":\"{26088ad5-f875-4693-a609-105712026639}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"1.0.6\"},{\"appid\":\""
		"hnimpnehoodheedghdeeijklkeaacbdc\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.6f6bc93dcd62dc251850d2ff458fda96083ceb7fbe8eeb11248b8485ef2aea23\"}]},\"ping\":{\"ping_freshness\":\"{5587f6bc-77fd-47f2-aa02-dd6e8a68e7d4}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"0.57.44.2492\"},{\"appid\":\"hfnkpimlhhgieaddgfemjhofmfblmnib\",\"brand\":\"GGLS\",\"cohort\":\"1:jcl:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{"
		"\"package\":[{\"fp\":\"1.c301250a29f58fbd0df05fa418facbf816238203c2bc4a9fbad3ec8ba3df5a60\"}]},\"ping\":{\"ping_freshness\":\"{32a4f54d-728f-4644-abca-b51260ecac8d}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"6701\"},{\"appid\":\"lmelglejhemejginpboagddgdfbepgmp\",\"brand\":\"GGLS\",\"cohort\":\"1:lwl:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.d36e34ff48b9ee4a4361007c63aebae5f66afbf9379436f2649b414d802e1f5e\"}]},\"ping\":{\""
		"ping_freshness\":\"{0e1a4ab6-8206-4170-95e2-c659e545043a}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"286\"},{\"appid\":\"kiabhabjdbkjdpjbpigfodbdjmbglcoo\",\"brand\":\"GGLS\",\"cohort\":\"1:v3l:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.3f9586c98c873f7ef653c121b08e729c35f4871bcd1181bdadb45e8199b7935c\"}]},\"ping\":{\"ping_freshness\":\"{0421572d-62e2-438a-b0e2-7eb1f8bd3bd6}\",\"rd\":5294},\"updatecheck\":{},\"version\":\""
		"2021.6.21.1\"},{\"appid\":\"llkgjffcdpffmhiakmfcdcblohccpfmo\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.2731bdeddb1470bf2f7ae9c585e7315be52a8ce98b8af698ece8e500426e378a\"}]},\"ping\":{\"ping_freshness\":\"{f06a7bf4-1f3c-4443-a45a-224caa36486b}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"1.0.0.8\"},{\"appid\":\"aemomkdncapdnfajjbbcbdebjljbpmpj\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"ping\":{\"ping_freshness\":\""
		"{b8ae2427-ef55-4ab3-8f08-0a69ee614306}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"1.0.5.0\"},{\"appid\":\"giekcmmlnklenlaomppkphknjmnnpneh\",\"brand\":\"GGLS\",\"cohort\":\"1:j5l:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.fd515ec0dc30d25a09641b8b83729234bc50f4511e35ce17d24fd996252eaace\"}]},\"ping\":{\"ping_freshness\":\"{41091193-de21-44c3-be4c-7b46cac0040b}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"7\"},{\"appid\":\""
		"gkmgaooipdjhmangpemjhigmamcehddo\",\"brand\":\"GGLS\",\"cohort\":\"1:pw3:\",\"cohorthint\":\"Stable\",\"cohortname\":\"Stable\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.59f3cd55c9e8be86981b6fd6adf0114bab54ee03b615e01cb21ead086ca4cb45\"}]},\"ping\":{\"ping_freshness\":\"{af08b9ba-c5c8-4003-9fb2-0e633720b41a}\",\"rd\":5294},\"tag\":\"eset_exp_b\",\"updatecheck\":{},\"version\":\"91.265.200\"},{\"appid\":\"jflookgnkcckhobaglndicnbbgbonegd\",\"brand\":\"GGLS\",\"cohort\":\"1:s7x:\",\""
		"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.9fdd2a3fca96a98759c9befadc1906d5f5ee20c3ea6f8bf7fcc2b7aa7acb4244\"}]},\"ping\":{\"ping_freshness\":\"{ae33737b-6fe9-407d-8de5-60113d287f38}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2656\"},{\"appid\":\"ggkkehgbnfjpeggfpleeakpidbkibbmn\",\"brand\":\"GGLS\",\"cohort\":\"1:ut9:\",\"cohorthint\":\"M80ToM99\",\"cohortname\":\"M80ToM99\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\""
		"1.e03336cad15559578407db3fc7c08de34022cd38341bcf10f88b6ff93cf0d9b9\"}]},\"ping\":{\"ping_freshness\":\"{bb2f8cdd-61c3-4a04-9c77-a6b4d4b10f80}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2021.6.21.1141\"},{\"appid\":\"jamhcnnkihinmdlkakkaopbjbbcngflc\",\"brand\":\"GGLS\",\"cohort\":\"1:wvr:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.bbe0aeac658e0f51573b7b9400091b04c96139278c2f1629bf331d7869989e9e\"}]},\"ping\":{\"ping_freshness\":\""
		"{c69ded8c-779d-4a23-b04f-3a66ca8a0a1e}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"93.0.4558.0\"},{\"appid\":\"ojhpjlocmbogdgmfpkhlaaeamibhnphh\",\"brand\":\"GGLS\",\"cohort\":\"1:w0x:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.478aa915e78878e332a0b4bb4d2a6fb67ff1c7f7b62fe906f47095ba5ae112d0\"}]},\"ping\":{\"ping_freshness\":\"{61085bf9-ddc2-431d-8145-f616e26c220f}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"1\"},{\"appid\":\""
		"ehgidpndbllacpjalkiimkbadgjfnnmc\",\"brand\":\"GGLS\",\"cohort\":\"1:ofl:\",\"cohorthint\":\"stable64\",\"cohortname\":\"stable64\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.a8a79d350c2a5e3bc36226633a8e0bed0dfab184e77f38fc8f0820ebacf8eafc\"}]},\"ping\":{\"ping_freshness\":\"{3c3a57a9-d21a-4dd1-b6f0-e3fad4f3ebfe}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2018.8.8.0\"},{\"appid\":\"eeigpngbgcognadeebkilcpcaedhellh\",\"brand\":\"GGLS\",\"cohort\":\"1:w59:\",\"cohorthint\":\"Auto\""
		",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.c64c9c1008f3ba5f6e18b3ca524bc98dcd8acfae0a2720a8f1f3ef0f8d643d05\"}]},\"ping\":{\"ping_freshness\":\"{7954bccb-aa15-4773-8d01-bdd0510b1079}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2020.11.2.164946\"},{\"appid\":\"pdafiollngonhoadbmdoemagnfpdphbe\",\"brand\":\"GGLS\",\"cohort\":\"1:vz3:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\""
		"1.baeb7c645c7704139756b02bf2741430d94ea3835fb1de77fef1057d8c844655\"}]},\"ping\":{\"ping_freshness\":\"{a72b6b52-8d43-4841-ba70-35f875b8f8b8}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2021.2.22.1142\"}],\"arch\":\"x64\",\"dedup\":\"cr\",\"domainjoined\":false,\"hw\":{\"physmemory\":8},\"lang\":\"zh-CN\",\"nacl_arch\":\"x86-64\",\"os\":{\"arch\":\"x86_64\",\"platform\":\"Windows\",\"version\":\"10.0.19042.1052\"},\"prodversion\":\"91.0.4472.124\",\"protocol\":\"3.1\",\"requestid\":\""
		"{c4510854-5dc7-46f8-b66e-7639b8998323}\",\"sessionid\":\"{4d07e590-ef60-4fc9-98a1-cbecee2fa562}\",\"updater\":{\"autoupdatecheckenabled\":true,\"ismachine\":true,\"lastchecked\":0,\"laststarted\":0,\"name\":\"Omaha\",\"updatepolicy\":-1,\"version\":\"1.3.36.82\"},\"updaterversion\":\"91.0.4472.124\"}}", 
		LAST);

	lr_rendezvous("upload_zvous");

	lr_think_time(9);

	lr_start_transaction("upload_transaction");

	web_submit_data("image", 
		"Action=http://localhost:8080/DBed/image", 
		"Method=POST", 
		"EncType=multipart/form-data", 
		"RecContentType=application/json", 
		"Referer=http://localhost:8080/DBed/index.html", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=uploadImage", "Value=555.jpeg", "File=Yes", ENDITEM, 
		LAST);

	lr_end_transaction("upload_transaction",LR_AUTO);

	return 0;
}