package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbo implements caj {
    public final File a;
    public final dhx b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public cbo(File file, dhx dhxVar) {
        this.a = file;
        this.b = dhxVar;
    }

    @Override // defpackage.caj
    public final void a() {
        this.c.set(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        if (!this.c.get()) {
        } else {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }
}
