package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aau implements aaw {
    public final Object a;
    public Object b;
    private final List c = new ArrayList();

    public aau(Object obj) {
        this.a = obj;
        this.b = obj;
    }

    @Override // defpackage.aaw
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.aaw
    public final void b() {
        this.c.clear();
        this.b = this.a;
        d();
    }

    @Override // defpackage.aaw
    public final void c(Object obj) {
        this.c.add(this.b);
        this.b = obj;
    }

    protected abstract void d();

    @Override // defpackage.aaw
    public final void f() {
        if (this.c.isEmpty()) {
            ael.b("empty stack");
        }
        this.b = this.c.remove(r0.size() - 1);
    }

    @Override // defpackage.aaw
    public /* synthetic */ void e() {
    }
}
