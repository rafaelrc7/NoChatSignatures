# NoChatSignature

A really simple plugin that does the absolute minimum to remove chat reporting
capabilities without breaking the messages.

Many of the plugins I've seen on spigot's plugins pages tries to "improve" the
default chat format, what breaks message formatting done by others plugins such
as nicknames/colours/prefixes. This plugin also does not forgets to log the
messages to the server console. After all, the point is that the server owner
will do the moderation, not Microsoft.

## Requirements

- Minecraft 1.19+
- Java 17+ (Read note below)
- Spigot

The pre-compiled distributed binary is compiled using Java 17, this means
you'll need Java 17+ to run it. If you use older java versions you may compile
it yourself or open an issue asking for it, and I'll compile it for you.


## How does it work
Simply, this plugin "intercepts" chat message events, cancel them, and re-sends
the message to its original recipients, using the original formatting, trough
the server and to the server console.

## Licence
This software is licensed under the [MIT Licence](/LICENCE).


