-- Soal A
select * from barang b 
where harga > 10000
order by harga asc ;

-- Soal B
select * from pelanggan p 
where nama like '%g%'
and alamat like 'BANDUNG';

-- Soal C
select 
t.kode as KODE, 
t.tanggal as TANGGAL, 
p.nama as "NAMA PELANGGAN", 
b.nama as "NAMA BARANG", 
t.jumlah_barang as "JUMLAH", 
b.harga as "HARGA SATUAN",
(t.jumlah_barang * b.harga) as TOTAL
from transaksi t 
join pelanggan p on p.kode = t.kode_pelanggan 
join barang b on b.kode = t.kode_barang
order by p.nama asc, t.tanggal asc;

-- Soal D
select 
p.nama as "NAMA PELANGGAN", 
sum(t.jumlah_barang) as "JUMLAH",
sum(t.jumlah_barang * b.harga) as "TOTAL HARGA"
from transaksi t 
join pelanggan p on p.kode = t.kode_pelanggan 
join barang b on b.kode = t.kode_barang
group by p.nama 
order by p.nama asc;


