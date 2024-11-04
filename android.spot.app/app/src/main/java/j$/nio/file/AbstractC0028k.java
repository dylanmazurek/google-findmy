package j$.nio.file;

import java.net.URI;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.nio.file.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0028k {
    static final AbstractC0026i a = ((j$.nio.file.spi.d) AccessController.doPrivileged((PrivilegedAction) new Object())).j(URI.create("file:///"));
}
