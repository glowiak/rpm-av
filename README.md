# rpm-av - rpm packcage installer written in java 6 (should work on newer)

# Depenciences:
- cpio
- bsdtar (or tar if you're on BSD)
- java (recommended version is 1.6.0)

# Download
Both binary and source are available [here](https://glowiak.github.io/rpm-av/distfiles.html)

# ArchPKG
Cooming soon

# Usage
  - To install a package uses following syntax:
  - $(which java) -jar rpm-av.jar /path/to/rpm/package /
  - If you compiled from source use it:
  - $(which java) rpm /path/to/rpm/package d/
  - You can replace this "/" at end to change installation directory
