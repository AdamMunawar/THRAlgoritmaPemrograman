class Perpustakaan:
    def __init__(self):
        self.buku = {}

    def tambah_buku(self, judul, pengarang):
        self.buku[judul] = pengarang
        print(f"Buku '{judul}' oleh {pengarang} telah ditambahkan.")

    def cari_buku(self, judul):
        if judul in self.buku:
            print(f"Buku '{judul}' ditemukan, pengarangnya adalah {self.buku[judul]}.")
        else:
            print(f"Buku '{judul}' tidak ditemukan dalam perpustakaan.")

    def hapus_buku(self, judul):
        if judul in self.buku:
            del self.buku[judul]
            print(f"Buku '{judul}' telah dihapus dari perpustakaan.")
        else:
            print(f"Buku '{judul}' tidak ditemukan dalam perpustakaan.")

    def daftar_buku(self):
        print("Daftar Buku dalam Perpustakaan:")
        for judul, pengarang in self.buku.items():
            print(f"- {judul} oleh {pengarang}")


def main():
    perpustakaan = Perpustakaan()

    while True:
        print("\nMenu:")
        print("1. Tambah Buku")
        print("2. Cari Buku")
        print("3. Hapus Buku")
        print("4. Daftar Buku")
        print("5. Keluar")

        pilihan = input("Pilih menu: ")

        if pilihan == '1':
            judul = input("Masukkan judul buku: ")
            pengarang = input("Masukkan nama pengarang: ")
            perpustakaan.tambah_buku(judul, pengarang)
        elif pilihan == '2':
            judul = input("Masukkan judul buku yang ingin dicari: ")
            perpustakaan.cari_buku(judul)
        elif pilihan == '3':
            judul = input("Masukkan judul buku yang ingin dihapus: ")
            perpustakaan.hapus_buku(judul)
        elif pilihan == '4':
            perpustakaan.daftar_buku()
        elif pilihan == '5':
            print("Terima kasih, sampai jumpa!")
            break
        else:
            print("Pilihan tidak valid. Silakan pilih menu yang benar.")


if __name__ == "__main__":
    main()
