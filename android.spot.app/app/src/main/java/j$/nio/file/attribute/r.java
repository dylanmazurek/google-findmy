package j$.nio.file.attribute;

import j$.nio.file.AbstractC0029l;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r implements FileAttribute {
    final /* synthetic */ InterfaceC0018p a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(InterfaceC0018p interfaceC0018p) {
        this.a = interfaceC0018p;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(AbstractC0029l.i((Set) this.a.value()));
    }
}
