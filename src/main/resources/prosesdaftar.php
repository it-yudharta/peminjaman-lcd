<?php require_once("koneksi.php");
$username = $_POST['username'];
$pass = $_POST['password'];
$cekuser = mysql_query("SELECT * FROM user WHERE username = '$username'");
if(mysql_num_rows($cekuser) <> 0) {
echo "Username Sudah Terdaftar!";
echo "<a href="daftar.php">&amp;amp;laquo; Back</a>";
} else {
if(!$username || !$pass) {
echo "Masih ada data yang kosong!";
echo "<a href="daftar.php">&amp;amp;laquo; Back</a>";
} else {
$simpan = mysql_query("INSERT INTO user(username, password) VALUES('$username','$pass')");
if($simpan) {
echo "Pendaftaran Sukses, Silahkan <a href="login.php">Login</a>";
} else {
echo "Proses Gagal!";
}
}
}
?>