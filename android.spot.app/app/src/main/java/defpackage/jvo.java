package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jvo extends jhx {
    private final ListIterator a;

    public jvo(ListIterator listIterator) {
        this.a = listIterator;
    }

    @Override // defpackage.jhx, defpackage.jhv
    protected final /* synthetic */ Iterator a() {
        return this.a;
    }

    @Override // defpackage.jhx, java.util.ListIterator
    public final void add(Object obj) {
        obj.getClass();
        this.a.add(obj);
    }

    @Override // defpackage.jhx
    protected final ListIterator b() {
        return this.a;
    }

    @Override // defpackage.jhv, defpackage.jic
    protected final /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.jhx, java.util.ListIterator
    public final void set(Object obj) {
        obj.getClass();
        this.a.set(obj);
    }
}
