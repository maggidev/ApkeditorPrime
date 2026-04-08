cmake_minimum_required(VERSION 3.22.1)
project("core-native")

add_library(
    core-native
    SHARED
    axml_parser.cpp
    prime_engine.cpp
)

find_library(
    log-lib
    log
)

target_link_libraries(
    core-native
    ${log-lib}
)
