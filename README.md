# Unexpected List Modification with removeIf in Kotlin

This repository demonstrates a subtle bug related to the `removeIf` function when used with mutable lists in Kotlin. The issue arises from the in-place modification of the list, leading to unexpected behavior if not handled carefully.

## Bug Description

The provided `bug.kt` file contains a simple program that uses `removeIf` to remove even numbers from a list. The issue occurs because `removeIf` modifies the list directly, which can be problematic in certain scenarios. For instance, if the loop iterates over the list while modifications happen inside the loop, the index can get out of sync, possibly skipping elements or causing an `IndexOutOfBoundsException`.