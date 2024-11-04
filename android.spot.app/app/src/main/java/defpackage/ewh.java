package defpackage;

import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewh extends cfk {
    public final Supplier a;
    private final Consumer h;
    private final Consumer i;
    private final ela j = new ela(this, 10, null);

    public ewh(Consumer consumer, Consumer consumer2, Supplier supplier) {
        this.h = consumer;
        this.i = consumer2;
        this.a = supplier;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cfk
    public final void b() {
        Object obj;
        this.h.accept(this.j);
        obj = this.a.get();
        l(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cfk
    public final void c() {
        this.i.accept(this.j);
    }
}
