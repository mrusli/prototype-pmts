/**
 *  to test whether this js is working --> alert("Hello...");
 */
const links = document.querySelectorAll(".smenu");
const themeToggler = document.querySelector(".theme-toggler");

function updateMenuLabel(menuLabel,stringList) {
  // var addMenuVar = document.getElementById("addMenuLabel").innerHTML;
  // console.log(addMenuVar);
  
  // console.log(menuLabel);
  // document.getElementById("addMenuLabel").innerHTML = menuLabel;
  
  // console.log(stringList);
  // var objList = JSON.parse(stringList);
  // console.log(objList.length);
  // console.log(objList);
  // var obj0 = objList[0];
  // console.log(obj0);
  // objList.forEach(obj => console.log(obj.id+" "+obj.name));
}

links.forEach(btn => btn.addEventListener("click",(e)=>{
    e.preventDefault();
    document.querySelector(".smenu.active").classList.remove("active");
    btn.classList.add("active");
}));

// change theme
themeToggler.addEventListener('click', ()=>{
    document.body.classList.toggle('dark-theme-variables');

    themeToggler.querySelector('span:nth-child(1)').classList.toggle('active');
    themeToggler.querySelector('span:nth-child(2)').classList.toggle('active');
});

function disableSettingsMenu(disable) {
	console.log(disable);

	var settingsMenu = document.getElementById("adminSettingsMenu");
	
	if (disable=="true") {
		settingsMenu.style.display = "flex";	
	} else {
		settingsMenu.style.display = "none";		
	}
}

function dashboard01MenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickDashboard01Menu', 'Dashboard01...'));
}

function dashboard02MenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickDashboard02Menu', 'Dashboard02...'));
}

function dashboard03MenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickDashboard03Menu', 'Dashboard03...'));
}

function pendaftaranMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPendaftaranMenu', 'Pendaftaran...'));
}


function perhitunganMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPerhitunganMenu', 'Perhitungan...'));
}

function daftarHitamPutihClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickDaftarHitamPutihMenu', 'Daftar HitamPutih...'));
}

function pesanMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPesanMenu', 'Pesan...'));	
}

function pelaporanMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPelaporanMenu', 'Pelaporan...'));
}

function kejadianMenonjolMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickKejadianMenonjolMenu', 'Kejadian Menonjol...'));
}

function settingsMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickSettingsMenu', 'Settings...'));
}

function logoutMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickLogout', 'Logout...'));
}