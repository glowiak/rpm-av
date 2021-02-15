# rpm-av - rpm package installer written in java 6 (should work on newer)

# Depenciences:
- cpio
- bsdtar (or tar if you're on BSD)
- java (recommended version is 1.6.0)

# Download
Both binary and source are available [here](https://glowiak.github.io/rpm-av/distfiles)

# ArchPKG
Package for ArchLinux that contains prebuild java 1.6.0 runtime can be downloaded from [here](https://glowiak.github.io/rpm-av/distfiles)
- Use:
- rpm-av /path/to/rpm/package /
- Instead of normal use method

# Installing from archtools repository on Arch
rpm-av can be also installed from 'archtools' repository; First add this repository:
  - "
  - [archtools]
  - SigLevel = Never
  - Server = http://github.com/glowiak/arch-tools/releases/download/server
  - " Add this to /etc/pacman.conf, and run 'pacman -Syy', then install rpm-av package with pacman -S

# Installing using Installer
rpm-av also has an Installer created using SHAR (SHell ARchiver), can be downloaded from [here](https://github.com/glowiak/rpm-av/releases/download/1.0/install.sh) or in distfiles. Usage:
  - root# sh install.sh

# Usage
  - To install a package uses following syntax:
  - $(which java) -jar rpm-av.jar /path/to/rpm/package /
  - If you compiled from source use it:
  - $(which java) rpm /path/to/rpm/package /
  - You can replace this "/" at end to change installation directory
