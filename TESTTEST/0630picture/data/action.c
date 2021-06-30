Action()
{

	web_add_cookie("Idea-29faa48e=048d51ff-c7eb-463e-93f7-b5e28a992ef7; DOMAIN=localhost");

	web_url("index.html", 
		"URL=http://localhost:8080/DBed/index.html", 
		"Resource=0", 
		"Referer=", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=image", ENDITEM, 
		"Url=imageShow?imageId=19", ENDITEM, 
		"Url=imageShow?imageId=20", ENDITEM, 
		"Url=imageShow?imageId=21", ENDITEM, 
		"Url=imageShow?imageId=22", ENDITEM, 
		"Url=imageShow?imageId=28", ENDITEM, 
		LAST);

	lr_rendezvous("upload_zvous");

	lr_start_transaction("uploat_transaction");

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

	web_custom_request("json", 
		"URL=http://update.googleapis.com/service/update2/json?cup2key=10:392256654&cup2hreq=ffd96a32615ef542970eea7c90a40d9596193518b61e016e9f0d13c6b24ad879", 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		"EncType=application/json", 
		"Body={\"request\":{\"@os\":\"win\",\"@updater\":\"chrome\",\"acceptformat\":\"crx2,crx3\",\"app\":[{\"appid\":\"ihnlcenocehgdaegdmhbidjhnhdchfmm\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"ping\":{\"ping_freshness\":\"{00736654-65cf-4a65-8a88-039226ccb3e3}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"0.0.0.0\"},{\"accept_locale\":\"ZHCN\",\"appid\":\"obedbbhbpmojnkanicioggnmelmoomoc\",\"brand\":\"GGLS\",\"cohort\":\"1:s6f:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\""
		"enabled\":true,\"ping\":{\"ping_freshness\":\"{a14c2eed-1ad2-4ce5-8a26-5aa6f64f643a}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"0.0.0.0\"},{\"appid\":\"kiabhabjdbkjdpjbpigfodbdjmbglcoo\",\"brand\":\"GGLS\",\"cohort\":\"1:v3l:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.3f9586c98c873f7ef653c121b08e729c35f4871bcd1181bdadb45e8199b7935c\"}]},\"ping\":{\"ping_freshness\":\"{91e8dc2e-b02b-432c-bbf1-4bd66e309f60}\",\"rd\":5294},\""
		"updatecheck\":{},\"version\":\"2021.6.21.1\"},{\"appid\":\"oimompecagnajdejgnnjijobebaeigek\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"ping\":{\"ping_freshness\":\"{5bef5c7c-c454-4c75-a51e-a10ba30b98d7}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"4.10.2209.0\"},{\"appid\":\"gcmjkmgdlgnkkcocmoeiminaijmmjnii\",\"brand\":\"GGLS\",\"cohort\":\"1:bm1:1069@0.01,1089@0.1\",\"cohorthint\":\"M54ToM99\",\"cohortname\":\"M54ToM99\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\""
		"1.91ee417000553ca22ed67530545c4177a08e7ffcf602c292a71bd89ecd0568a5\"}]},\"ping\":{\"ping_freshness\":\"{1477d341-a5fb-46a6-ab9a-d5172b4ea307}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"9.28.0\"},{\"appid\":\"dhlpobdgcjafebgbbhjdnapejmpkgiie\",\"brand\":\"GGLS\",\"cohort\":\"1:z9x:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.3eeded944371798374de67d1fa7bb8f32f90a7cd502b04ee71e0de0cf79e2a11\"}]},\"ping\":{\"ping_freshness\":\""
		"{677f6103-b48d-4052-8a6f-11ba24d090a4}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"20210609.1\"},{\"appid\":\"aemomkdncapdnfajjbbcbdebjljbpmpj\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"ping\":{\"ping_freshness\":\"{73768029-cbf2-4542-8f8b-4ab72752baf7}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"1.0.5.0\"},{\"appid\":\"lmelglejhemejginpboagddgdfbepgmp\",\"brand\":\"GGLS\",\"cohort\":\"1:lwl:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{"
		"\"package\":[{\"fp\":\"1.d36e34ff48b9ee4a4361007c63aebae5f66afbf9379436f2649b414d802e1f5e\"}]},\"ping\":{\"ping_freshness\":\"{ca044bff-b876-405f-a804-a2ea2974e8fb}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"286\"},{\"appid\":\"cmahhnpholdijhjokonmfdjbfmklppij\",\"brand\":\"GGLS\",\"cohort\":\"1:wr3:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.b4ddbdce4f8d5c080328aa34c19cb533f2eedec580b5d97dc14f74935e4756b7\"}]},\"ping\":{\""
		"ping_freshness\":\"{af1fed3e-280c-43de-8e38-0d159c03631d}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"1.0.6\"},{\"appid\":\"giekcmmlnklenlaomppkphknjmnnpneh\",\"brand\":\"GGLS\",\"cohort\":\"1:j5l:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.fd515ec0dc30d25a09641b8b83729234bc50f4511e35ce17d24fd996252eaace\"}]},\"ping\":{\"ping_freshness\":\"{fe0dcede-6a86-4ffe-9a34-ab4dfee1836b}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"7\"},"
		"{\"appid\":\"llkgjffcdpffmhiakmfcdcblohccpfmo\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.2731bdeddb1470bf2f7ae9c585e7315be52a8ce98b8af698ece8e500426e378a\"}]},\"ping\":{\"ping_freshness\":\"{c60faf67-1669-4d44-8b4e-89d172c06a9f}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"1.0.0.8\"},{\"appid\":\"khaoiebndkojlmppeemjhbpbandiljpe\",\"brand\":\"GGLS\",\"cohort\":\"1:cux:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\""
		"packages\":{\"package\":[{\"fp\":\"1.ffd1d2d75a8183b0a1081bd03a7ce1d140fded7a9fb52cf3ae864cd4d408ceb4\"}]},\"ping\":{\"ping_freshness\":\"{c11025fe-0dd8-4c38-a753-7b70b4c2ae06}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"43\"},{\"appid\":\"gkmgaooipdjhmangpemjhigmamcehddo\",\"brand\":\"GGLS\",\"cohort\":\"1:pw3:\",\"cohorthint\":\"Stable\",\"cohortname\":\"Stable\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.59f3cd55c9e8be86981b6fd6adf0114bab54ee03b615e01cb21ead086ca4cb45\"}]},\""
		"ping\":{\"ping_freshness\":\"{9f75d640-16e3-4491-9f7e-92f4151436ae}\",\"rd\":5294},\"tag\":\"eset_exp_b\",\"updatecheck\":{},\"version\":\"91.265.200\"},{\"appid\":\"jflookgnkcckhobaglndicnbbgbonegd\",\"brand\":\"GGLS\",\"cohort\":\"1:s7x:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.9fdd2a3fca96a98759c9befadc1906d5f5ee20c3ea6f8bf7fcc2b7aa7acb4244\"}]},\"ping\":{\"ping_freshness\":\"{4b6b9208-c4f4-4add-a501-ca94c7377a96}\",\"rd\":5294},"
		"\"updatecheck\":{},\"version\":\"2656\"},{\"appid\":\"hnimpnehoodheedghdeeijklkeaacbdc\",\"brand\":\"GGLS\",\"cohort\":\"1::\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.6f6bc93dcd62dc251850d2ff458fda96083ceb7fbe8eeb11248b8485ef2aea23\"}]},\"ping\":{\"ping_freshness\":\"{504d7101-6d4c-454f-85f1-a6a8e3604c69}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"0.57.44.2492\"},{\"appid\":\"pdafiollngonhoadbmdoemagnfpdphbe\",\"brand\":\"GGLS\",\"cohort\":\"1:vz3:\",\"cohorthint\":\"Auto\",\""
		"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.baeb7c645c7704139756b02bf2741430d94ea3835fb1de77fef1057d8c844655\"}]},\"ping\":{\"ping_freshness\":\"{8ee8c3c1-5830-4ef5-b8ae-35e65be7dde3}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2021.2.22.1142\"},{\"appid\":\"jamhcnnkihinmdlkakkaopbjbbcngflc\",\"brand\":\"GGLS\",\"cohort\":\"1:wvr:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\""
		"1.bbe0aeac658e0f51573b7b9400091b04c96139278c2f1629bf331d7869989e9e\"}]},\"ping\":{\"ping_freshness\":\"{55843612-b825-4469-801b-9303d379d46b}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"93.0.4558.0\"},{\"appid\":\"ggkkehgbnfjpeggfpleeakpidbkibbmn\",\"brand\":\"GGLS\",\"cohort\":\"1:ut9:\",\"cohorthint\":\"M80ToM99\",\"cohortname\":\"M80ToM99\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.e03336cad15559578407db3fc7c08de34022cd38341bcf10f88b6ff93cf0d9b9\"}]},\"ping\":{\""
		"ping_freshness\":\"{cc6a5077-3b5c-4361-b623-718435e47f35}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2021.6.21.1141\"},{\"appid\":\"ehgidpndbllacpjalkiimkbadgjfnnmc\",\"brand\":\"GGLS\",\"cohort\":\"1:ofl:\",\"cohorthint\":\"stable64\",\"cohortname\":\"stable64\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.a8a79d350c2a5e3bc36226633a8e0bed0dfab184e77f38fc8f0820ebacf8eafc\"}]},\"ping\":{\"ping_freshness\":\"{d591cf75-c489-4419-af5c-11be36c9d1b9}\",\"rd\":5294},\"updatecheck\":{},\""
		"version\":\"2018.8.8.0\"},{\"appid\":\"hfnkpimlhhgieaddgfemjhofmfblmnib\",\"brand\":\"GGLS\",\"cohort\":\"1:jcl:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.c301250a29f58fbd0df05fa418facbf816238203c2bc4a9fbad3ec8ba3df5a60\"}]},\"ping\":{\"ping_freshness\":\"{9753c437-3660-48e6-a723-f78500d52337}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"6701\"},{\"appid\":\"ojhpjlocmbogdgmfpkhlaaeamibhnphh\",\"brand\":\"GGLS\",\"cohort\":\"1:w0x:"
		"\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.478aa915e78878e332a0b4bb4d2a6fb67ff1c7f7b62fe906f47095ba5ae112d0\"}]},\"ping\":{\"ping_freshness\":\"{adf348ba-584c-4591-b6f9-a8545d0d9388}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"1\"},{\"appid\":\"eeigpngbgcognadeebkilcpcaedhellh\",\"brand\":\"GGLS\",\"cohort\":\"1:w59:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\""
		"1.c64c9c1008f3ba5f6e18b3ca524bc98dcd8acfae0a2720a8f1f3ef0f8d643d05\"}]},\"ping\":{\"ping_freshness\":\"{accc8e68-e5ac-4727-b08b-06337f464232}\",\"rd\":5294},\"updatecheck\":{},\"version\":\"2020.11.2.164946\"}],\"arch\":\"x64\",\"dedup\":\"cr\",\"domainjoined\":false,\"hw\":{\"physmemory\":8},\"lang\":\"zh-CN\",\"nacl_arch\":\"x86-64\",\"os\":{\"arch\":\"x86_64\",\"platform\":\"Windows\",\"version\":\"10.0.19042.1052\"},\"prodversion\":\"91.0.4472.124\",\"protocol\":\"3.1\",\"requestid\":\""
		"{4d4bb086-0234-43a4-a669-5aeaa508c5d0}\",\"sessionid\":\"{110f76ef-8b94-433a-b2a9-49fc343838eb}\",\"updater\":{\"autoupdatecheckenabled\":true,\"ismachine\":true,\"lastchecked\":0,\"laststarted\":0,\"name\":\"Omaha\",\"updatepolicy\":-1,\"version\":\"1.3.36.82\"},\"updaterversion\":\"91.0.4472.124\"}}", 
		LAST);

	lr_end_transaction("uploat_transaction",LR_AUTO);

	return 0;
}