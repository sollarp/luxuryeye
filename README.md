

<table style="width: 100%;">
  <tr>
    <td align="center" valign="top">
      <img src="https://github.com/user-attachments/assets/d22815e4-b895-4655-bb6d-fc33a3d4f176" width="250" /><br />
      <sub><b>Home Page</b></sub>
    </td>
    <td align="center" valign="top">
      <img src="https://github.com/user-attachments/assets/aa3c208d-6d42-4fbc-9c2b-8c4b5941aa1e" width="250" /><br />
      <sub><b>Cart</b></sub>
    </td>
    <td align="center" valign="top">
      <img src="https://github.com/user-attachments/assets/3ee8b762-d459-4225-b91b-780fcdbd2752" width="250" /><br />
      <sub><b>Product Item</b></sub>
    </td>
  </tr>
</table>


This README has been expanded with technical specifics and architectural details aligned with modern Kotlin Multiplatform (KMP) development, specifically for the **LuxuryEye** ecosystem.

---

# 👁️ LuxuryEye E-Commerce App

A high-performance, cross-platform e-commerce solution for **LuxuryEye**, the premier destination for professional lash and brow stylists. Built with **Kotlin Multiplatform (KMP)** and **Compose Multiplatform**, this app provides a native experience across Android, iOS, and Desktop from a single shared codebase.

## ✨ Core Features

### 🛍️ Professional E-Commerce Experience
* **Dynamic Product Catalog:** Instant access to over 600+ product variants including premium lashes (Classic, Volume, Colored), high-performance adhesives, and UV/LED accessories.
* **Smart Student Discounts:** Integrated logic to automatically apply lifetime discounts (up to 20%) for verified LuxuryEye Academy trainees.
* **Real-time Inventory:** Direct synchronization with the LuxuryEye backend to reflect stock levels for pro-grade supplies.
* **Global Logistics:** Real-time shipping calculations with EU-wide support and automated "Free Shipping" triggers for orders over €150.

### 🎓 Academy & Training Integration
* **Workshop Booking:** Seamless interface for browsing and booking 1D Foundation, Volume, and Mentoring workshops.
* **Pro Resources:** In-app access to training manuals, lash maps, and digital e-books for certified stylists.

---

## 🛠 Tech Stack (The Modern KMP Way)

This project leverages the "Bleeding Edge" of the Kotlin ecosystem to ensure scalability and performance:

* **[Kotlin 2.1.0+](https://kotlinlang.org/):** Powered by the **K2 compiler** for significantly faster build times and improved IDE performance.
* **[Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/):** 100% shared UI code across platforms, rendering natively on each target for maximum fluidness.
* **[Ktor](https://ktor.io/):** Type-safe, asynchronous networking client used to communicate with the LuxuryEye REST API.
* **[SQLDelight](https://cashapp.github.io/sqldelight/):** Multiplatform database logic with type-safe SQL, used for local product caching and offline cart management.
* **[Koin](https://insert-koin.io/):** A pragmatic, lightweight dependency injection framework shared across all targets.
* **[Voyager](https://voyager.adriel.cafe/):** A multiplatform navigation library built specifically for Compose.
* **[Coil3](https://github.com/coil-kt/coil):** High-performance, multiplatform image loading for high-resolution product galleries.

---

## 🏗 Project Architecture

The project follows a **Modular Clean Architecture** pattern to maintain a clear separation of concerns:

```text
├── composeApp/
│   ├── commonMain/         # Shared Logic, UI, Models, and API Interactors
│   ├── androidMain/        # Android-specific entry point & Manifest
│   ├── iosMain/            # iOS Framework hooks & SwiftUI wrappers
│   └── desktopMain/        # JVM-specific configuration (Windows/macOS/Linux)
├── server/                 # (Optional) Ktor-based backend for local testing
└── gradle/                 # Version catalogs (libs.versions.toml) for central dependency management
```

---

## 🚀 Getting Started

### Prerequisites
* **Android Studio Ladybug** (or newer).
* **JDK 17** or **21**.
* **Xcode 15+** (required for the iOS target).

### Build & Run
1.  **Clone the Repository:**
    ```bash
    git clone https://github.com/sollarp/luxuryeye.git
    ```
2.  **Run Android:** Select the `composeApp` configuration and click **Run**.
3.  **Run Desktop:**
    ```bash
    ./gradlew :composeApp:run
    ```
4.  **Run iOS:** Open the `iosApp` folder in Xcode or use the KMM plugin in Android Studio to run on a simulator.

## 📦 Distribution
Generate a production-ready desktop installer:
```bash
./gradlew :composeApp:packageReleaseDistributionForCurrentOS
```

---

> **Technical Note:** This app utilizes **KotlinX Serialization** for JSON parsing and **Coroutines/Flow** for reactive state management, ensuring that the LuxuryEye store remains responsive even on slower mobile networks.
