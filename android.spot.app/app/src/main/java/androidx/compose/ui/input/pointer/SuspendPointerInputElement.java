package androidx.compose.ui.input.pointer;

import defpackage.amr;
import defpackage.aow;
import defpackage.auz;
import defpackage.azf;
import defpackage.mol;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends azf {
    private final Object a;
    private final Object b;
    private final Object[] c = null;
    private final mol e;

    public SuspendPointerInputElement(Object obj, Object obj2, mol molVar) {
        this.a = obj;
        this.b = obj2;
        this.e = molVar;
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ aow d() {
        return new auz(this.a, this.b, this.e);
    }

    @Override // defpackage.azf
    public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        auz auzVar = (auz) aowVar;
        Object obj = auzVar.a;
        Object obj2 = this.a;
        boolean z = !amr.i(obj, obj2);
        auzVar.a = obj2;
        Object obj3 = auzVar.b;
        Object obj4 = this.b;
        boolean z2 = !amr.i(obj3, obj4);
        auzVar.b = obj4;
        if (z | z2) {
            auzVar.v();
        }
        auzVar.c = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!amr.i(this.a, suspendPointerInputElement.a) || !amr.i(this.b, suspendPointerInputElement.b)) {
            return false;
        }
        Object[] objArr = suspendPointerInputElement.c;
        if (this.e == suspendPointerInputElement.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.e.hashCode();
    }
}
