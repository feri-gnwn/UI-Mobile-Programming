# PrakPM

Aplikasi pembelajaran Pemrograman Mobile berbasis Android yang dibangun menggunakan **Kotlin** dan **Jetpack Compose**.

Project ini dikembangkan sebagai bagian dari praktikum Pemrograman Mobile untuk mempelajari implementasi antarmuka Android modern, composable UI, navigation component, serta penerapan struktur project Android menggunakan Kotlin.

## ✨ Features

* 🏠 **Home Dashboard**

  * Menampilkan profil pengguna
  * Ringkasan materi pembelajaran
  * Today's Focus
  * Topik pembelajaran seperti Compose dan Architecture

* 📚 **Lessons**

  * Navigasi menuju bagian pembelajaran

* 👥 **Class**

  * Bagian untuk informasi atau aktivitas kelas

* 👤 **Profile**

  * Bagian profil pengguna

* ➕ **Floating Action Button**

  * Tombol aksi utama pada halaman beranda

* 🎨 **Modern UI**

  * Menggunakan Jetpack Compose
  * Material 3
  * Custom color system dan reusable components

## 🛠️ Tech Stack

| Technology            | Description              |
| --------------------- | ------------------------ |
| **Kotlin**            | Bahasa pemrograman utama |
| **Jetpack Compose**   | Framework UI deklaratif  |
| **Material 3**        | Design system Android    |
| **Android SDK**       | Platform aplikasi        |
| **Gradle Kotlin DSL** | Build configuration      |
| **Android Studio**    | IDE pengembangan         |

## 📁 Project Structure

```text
prakpm/
├── app/
│   ├── src/
│   │   ├── androidTest/
│   │   └── main/
│   │       ├── java/com/feri/myapplication/
│   │       │   ├── MainActivity.kt
│   │       │   └── ui/
│   │       │       └── theme/
│   │       │           ├── component/
│   │       │           ├── AppColors.kt
│   │       │           ├── Color.kt
│   │       │           ├── FocusItem.kt
│   │       │           ├── Theme.kt
│   │       │           ├── TopicCard.kt
│   │       │           └── Type.kt
│   │       │
│   │       └── res/
│   │           ├── drawable/
│   │           ├── mipmap/
│   │           └── values/
│   │
│   └── build.gradle.kts
│
├── build.gradle.kts
├── settings.gradle.kts
└── gradle/
```

## 🚀 Getting Started

### Prerequisites

Pastikan perangkat sudah memiliki:

* [Android Studio](https://developer.android.com/studio)
* JDK yang kompatibel dengan Android Studio
* Android SDK
* Android Emulator atau perangkat Android fisik

### Installation

Clone repository:

```bash
git clone https://github.com/feri-gnwn/UI-Mobile-Programming.git
```

Masuk ke folder project:

```bash
cd UI-Mobile-Programming
```

Kemudian buka project menggunakan Android Studio dan tunggu proses **Gradle Sync** selesai.

### Running the App

1. Hubungkan perangkat Android atau jalankan Android Emulator.
2. Pastikan perangkat terdeteksi oleh Android Studio.
3. Pilih konfigurasi `app`.
4. Klik **Run ▶**.

Atau jalankan melalui terminal:

```bash
./gradlew installDebug
```

Untuk Windows:

```powershell
.\gradlew.bat installDebug
```

## 🎨 UI Components

Project menggunakan beberapa reusable composable components untuk menjaga konsistensi tampilan, di antaranya:

* `CardPrimary`
* `ProfileChip`
* `TopicCard`
* `FocusItem`

Struktur component dipisahkan dari `MainActivity` agar UI lebih mudah dikembangkan dan dipelihara.

## 📱 Current Status

Project saat ini berada pada tahap pengembangan awal dengan fokus pada:

* Implementasi dashboard
* Implementasi Jetpack Compose UI
* Custom theme dan color system
* Reusable components
* Bottom navigation
* Struktur dasar halaman aplikasi

Beberapa fitur navigasi dan fungsionalitas masih dalam tahap pengembangan.

## 🔮 Future Development

Rencana pengembangan berikutnya meliputi:

* [ ] Implementasi halaman Lessons
* [ ] Implementasi halaman Class
* [ ] Implementasi halaman Profile
* [ ] Navigation antar halaman
* [ ] Penyimpanan data menggunakan Room
* [ ] Implementasi autentikasi pengguna
* [ ] State management yang lebih terstruktur
* [ ] Penerapan MVVM Architecture
* [ ] Integrasi data pembelajaran
* [ ] Testing dan peningkatan UX

## 👨‍💻 Developer

**Feri Gunawan**

Student of Information Technology
Faculty of Computer Science and Information Technology
Universitas Sumatera Utara

---

## 📄 License

This project is developed for educational purposes as part of the Mobile Programming course.
