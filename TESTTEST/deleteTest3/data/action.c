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
		"Url=imageShow?imageId=20", ENDITEM, 
		"Url=imageShow?imageId=22", ENDITEM, 
		"Url=imageShow?imageId=37", ENDITEM, 
		LAST);

	web_url("iplookup.php", 
		"URL=http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=json&_=1625102723729", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=http://config.pinyin.sogou.com/api/toolbox/geturl.php?h=EE87B9689F789C6B0D845A32D1BAABFA&v=10.3.0.4581&r=0000_sogou_pinyin_103a", "Referer=", ENDITEM, 
		LAST);

	lr_rendezvous("op_zvous");

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
		"Name=uploadImage", "Value=777.jpeg", "File=Yes", ENDITEM, 
		LAST);

	lr_end_transaction("upload_transaction",LR_AUTO);

	web_custom_request("json", 
		"URL=http://update.googleapis.com/service/update2/json?cup2key=10:4138508144&cup2hreq=b1b91e17accdd244a37111c9d66b4d1f83da7a69bf882d5a241a53be86cdb519", 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		"EncType=application/json", 
		"Body={\"request\":{\"@os\":\"win\",\"@updater\":\"chrome\",\"acceptformat\":\"crx2,crx3\",\"app\":[{\"appid\":\"ihnlcenocehgdaegdmhbidjhnhdchfmm\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"ping\":{\"ping_freshness\":\"{c55c22ef-e698-4a60-9b25-51cd9363f785}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"0.0.0.0\"},{\"appid\":\"oimompecagnajdejgnnjijobebaeigek\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"ping\":{\"ping_freshness\":\"{844752d4-db84-4068-9e7d-983395c2bbe1"
		"}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"4.10.2209.0\"},{\"appid\":\"hnimpnehoodheedghdeeijklkeaacbdc\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.6f6bc93dcd62dc251850d2ff458fda96083ceb7fbe8eeb11248b8485ef2aea23\"}]},\"ping\":{\"ping_freshness\":\"{920f9b9f-2715-4573-a5ed-818772ac1dba}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"0.57.44.2492\"},{\"appid\":\"gcmjkmgdlgnkkcocmoeiminaijmmjnii\",\"brand\":\"GGLS\",\"cohort\":\"1:bm1"
		":1069@0.01,1089@0.1\",\"cohorthint\":\"M54ToM99\",\"cohortname\":\"M54ToM99\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.91ee417000553ca22ed67530545c4177a08e7ffcf602c292a71bd89ecd0568a5\"}]},\"ping\":{\"ping_freshness\":\"{49432c5f-e449-4eef-a377-043748caad7f}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"9.28.0\"},{\"accept_locale\":\"ZHCN\",\"appid\":\"obedbbhbpmojnkanicioggnmelmoomoc\",\"brand\":\"GGLS\",\"cohort\":\"1:s6f:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\""
		"enabled\":true,\"ping\":{\"ping_freshness\":\"{cec81609-dfea-44dd-839a-20ec247ec49e}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"0.0.0.0\"},{\"appid\":\"cmahhnpholdijhjokonmfdjbfmklppij\",\"brand\":\"GGLS\",\"cohort\":\"1:wr3:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.b4ddbdce4f8d5c080328aa34c19cb533f2eedec580b5d97dc14f74935e4756b7\"}]},\"ping\":{\"ping_freshness\":\"{2c824851-06f9-4b9b-8593-4fff55174794}\",\"rd\":5294},\""
		"updatecheck\":{},\"version\":\"1.0.6\"},{\"appid\":\"lmelglejhemejginpboagddgdfbepgmp\",\"brand\":\"GGLS\",\"cohort\":\"1:lwl:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.d36e34ff48b9ee4a4361007c63aebae5f66afbf9379436f2649b414d802e1f5e\"}]},\"ping\":{\"ping_freshness\":\"{ec9bc227-470d-4560-ba58-b64e14842334}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"286\"},{\"appid\":\"kiabhabjdbkjdpjbpigfodbdjmbglcoo\",\"brand\":\"GGLS\",\""
		"cohort\":\"1:v3l:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.3f9586c98c873f7ef653c121b08e729c35f4871bcd1181bdadb45e8199b7935c\"}]},\"ping\":{\"ping_freshness\":\"{cc263f8c-2f5b-443d-89f5-dfb0c5094e6d}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2021.6.21.1\"},{\"appid\":\"giekcmmlnklenlaomppkphknjmnnpneh\",\"brand\":\"GGLS\",\"cohort\":\"1:j5l:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\""
		"package\":[{\"fp\":\"1.fd515ec0dc30d25a09641b8b83729234bc50f4511e35ce17d24fd996252eaace\"}]},\"ping\":{\"ping_freshness\":\"{2e1169c6-0053-453f-a908-51d942d704c0}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"7\"},{\"appid\":\"khaoiebndkojlmppeemjhbpbandiljpe\",\"brand\":\"GGLS\",\"cohort\":\"1:cux:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.ffd1d2d75a8183b0a1081bd03a7ce1d140fded7a9fb52cf3ae864cd4d408ceb4\"}]},\"ping\":{\""
		"ping_freshness\":\"{5221bb30-0337-4fe4-81d7-f43eeb3aa533}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"43\"},{\"appid\":\"dhlpobdgcjafebgbbhjdnapejmpkgiie\",\"brand\":\"GGLS\",\"cohort\":\"1:z9x:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.3eeded944371798374de67d1fa7bb8f32f90a7cd502b04ee71e0de0cf79e2a11\"}]},\"ping\":{\"ping_freshness\":\"{51872534-cacb-475d-9d6e-b8b2435979e9}\",\"rd\":5294},\"updatecheck\":{},\"version\":\""
		"20210609.1\"},{\"appid\":\"hfnkpimlhhgieaddgfemjhofmfblmnib\",\"brand\":\"GGLS\",\"cohort\":\"1:jcl:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.29c44262089b755e19aa02c0be1ae2ca9d087f5eecd581516ea1305f4d4339d9\"}]},\"ping\":{\"ping_freshness\":\"{c2934343-d517-4379-a1e7-17d7c3d43e73}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"6702\"},{\"appid\":\"aemomkdncapdnfajjbbcbdebjljbpmpj\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\""
		":true,\"ping\":{\"ping_freshness\":\"{b4a02c4a-310b-416f-b8c2-aa4e4ef674e6}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"1.0.5.0\"},{\"appid\":\"llkgjffcdpffmhiakmfcdcblohccpfmo\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.2731bdeddb1470bf2f7ae9c585e7315be52a8ce98b8af698ece8e500426e378a\"}]},\"ping\":{\"ping_freshness\":\"{78bac503-f943-40d2-b089-8fcb56ab1117}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"1.0.0.8\"},{\"appid\":\""
		"gkmgaooipdjhmangpemjhigmamcehddo\",\"brand\":\"GGLS\",\"cohort\":\"1:pw3:\",\"cohorthint\":\"Stable\",\"cohortname\":\"Stable\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.59f3cd55c9e8be86981b6fd6adf0114bab54ee03b615e01cb21ead086ca4cb45\"}]},\"ping\":{\"ping_freshness\":\"{8b30df33-c2ae-4eae-9ce5-45bcc33076b9}\",\"rd\":5294},\"tag\":\"eset_exp_b\",\"updatecheck\":{},\"version\":\"91.265.200\"},{\"appid\":\"ehgidpndbllacpjalkiimkbadgjfnnmc\",\"brand\":\"GGLS\",\"cohort\":\"1:ofl:\",\""
		"cohorthint\":\"stable64\",\"cohortname\":\"stable64\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.a8a79d350c2a5e3bc36226633a8e0bed0dfab184e77f38fc8f0820ebacf8eafc\"}]},\"ping\":{\"ping_freshness\":\"{e8498ff2-9d1f-4196-9b38-44d0a072f7cc}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2018.8.8.0\"},{\"appid\":\"jflookgnkcckhobaglndicnbbgbonegd\",\"brand\":\"GGLS\",\"cohort\":\"1:s7x:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":"
		"\"1.c963f6d51cdf6ffd8352f0a7feeb3a5bde0cbfdcf1cdb7598ba8b58f06bf0207\"}]},\"ping\":{\"ping_freshness\":\"{8ee0bde0-44fc-4fbc-8c5d-8927138ee6f1}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2657\"},{\"appid\":\"ggkkehgbnfjpeggfpleeakpidbkibbmn\",\"brand\":\"GGLS\",\"cohort\":\"1:ut9:\",\"cohorthint\":\"M80ToM99\",\"cohortname\":\"M80ToM99\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.e03336cad15559578407db3fc7c08de34022cd38341bcf10f88b6ff93cf0d9b9\"}]},\"ping\":{\"ping_freshness\":\""
		"{e6ee18c2-9e95-4e56-9eec-f3d5e3469aa6}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2021.6.21.1141\"},{\"appid\":\"jamhcnnkihinmdlkakkaopbjbbcngflc\",\"brand\":\"GGLS\",\"cohort\":\"1:wvr:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.b1c7f3f019b6f59a04d656335bc26a411e76b203f3925f042cc36b646af93263\"}]},\"ping\":{\"ping_freshness\":\"{a1873474-e4f1-4572-8b19-bf7ca4eff8d4}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"93.0.4561.0\"},"
		"{\"appid\":\"pdafiollngonhoadbmdoemagnfpdphbe\",\"brand\":\"GGLS\",\"cohort\":\"1:vz3:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.baeb7c645c7704139756b02bf2741430d94ea3835fb1de77fef1057d8c844655\"}]},\"ping\":{\"ping_freshness\":\"{cf1cfc26-385d-4146-add7-3690660e21b1}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2021.2.22.1142\"},{\"appid\":\"ojhpjlocmbogdgmfpkhlaaeamibhnphh\",\"brand\":\"GGLS\",\"cohort\":\"1:w0x:\",\"cohorthint\""
		":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.478aa915e78878e332a0b4bb4d2a6fb67ff1c7f7b62fe906f47095ba5ae112d0\"}]},\"ping\":{\"ping_freshness\":\"{345c4bbe-c9a5-42b4-bad3-67c2d3930a17}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"1\"},{\"appid\":\"eeigpngbgcognadeebkilcpcaedhellh\",\"brand\":\"GGLS\",\"cohort\":\"1:w59:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\""
		"1.c64c9c1008f3ba5f6e18b3ca524bc98dcd8acfae0a2720a8f1f3ef0f8d643d05\"}]},\"ping\":{\"ping_freshness\":\"{6ad54d80-4988-456f-a0c8-cc630140da77}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2020.11.2.164946\"}],\"arch\":\"x64\",\"dedup\":\"cr\",\"domainjoined\":false,\"hw\":{\"physmemory\":8},\"lang\":\"zh-CN\",\"nacl_arch\":\"x86-64\",\"os\":{\"arch\":\"x86_64\",\"platform\":\"Windows\",\"version\":\"10.0.19042.1052\"},\"prodversion\":\"91.0.4472.124\",\"protocol\":\"3.1\",\"requestid\":\""
		"{ff7766b7-77ba-4ba3-9fa0-0116be749b95}\",\"sessionid\":\"{60be1cff-48cb-433d-bf05-5c5582730972}\",\"updater\":{\"autoupdatecheckenabled\":true,\"ismachine\":true,\"lastchecked\":0,\"laststarted\":0,\"name\":\"Omaha\",\"updatepolicy\":-1,\"version\":\"1.3.36.82\"},\"updaterversion\":\"91.0.4472.124\"}}", 
		LAST);

	lr_start_transaction("delete_transaction");

	web_custom_request("image_2", 
		"URL=http://localhost:8080/DBed/image?imageId=37", 
		"Method=DELETE", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://localhost:8080/DBed/index.html", 
		"Snapshot=t5.inf", 
		"Mode=HTML", 
		LAST);

	lr_end_transaction("delete_transaction",LR_AUTO);

	return 0;
}