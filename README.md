# Enkapsulasi
Latihan 1
![Output](https://user-images.githubusercontent.com/85090045/120136560-9f17f980-c1fc-11eb-94c4-7bd375823f60.png)
Perhatikan jumlah penumpang Bus terakhir dengan jumlah penumpang maksimum. Mengapa bisa demikian? : Karena pada penjumlahan tidak ada kondisi untuk membatasi jumlah penumpang. Pada statement ke-4, nilai statement sebelumnya ditambahkan dengan nilai 8 sehingga menjadi 16 yang mengakibatkan overload.

Latihan 2
![Output 1](https://user-images.githubusercontent.com/85090045/120137095-c4593780-c1fd-11eb-9c72-04f2f7d92102.png)
Penjelasan: Terdapat error saat dijalankan karena variable penumpang dan maxPenumpang di kelas Bus telah diubah menjadi private, maka kelas UjiBus tidak dapat secara langsung mengubah nilai dari variabel private tersebut. 
Ubah class UjiBus.java:
![Latihan 1 - NetBeans IDE 8 2 05_04_2021 23_33_40](https://user-images.githubusercontent.com/85090045/120137527-bb1c9a80-c1fe-11eb-814b-5efcd68e7371.png)
Output:
![Latihan 1 - NetBeans IDE 8 2 05_04_2021 23_33_48](https://user-images.githubusercontent.com/85090045/120137546-c96ab680-c1fe-11eb-87e8-41f2a2126bc2.png)
