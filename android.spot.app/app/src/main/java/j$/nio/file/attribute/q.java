package j$.nio.file.attribute;

import j$.nio.file.AbstractC0029l;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q implements InterfaceC0018p {
    final /* synthetic */ FileAttribute a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    @Override // j$.nio.file.attribute.InterfaceC0018p
    public final String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.InterfaceC0018p
    public final Object value() {
        Object value;
        value = this.a.value();
        return Collections.unmodifiableSet(AbstractC0029l.i((Set) value));
    }
}
