package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.autofill.AutofillId;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfi {
    public final Object a;
    public final Object b;

    public bfi(Animation animation) {
        this.a = animation;
        this.b = null;
    }

    public static final boolean m(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            return true;
        }
        return false;
    }

    public static final KeyListener n(KeyListener keyListener) {
        if (m(keyListener) && !(keyListener instanceof cde)) {
            if (keyListener == null) {
                return null;
            }
            if (!(keyListener instanceof NumberKeyListener)) {
                return new cde(keyListener);
            }
            return keyListener;
        }
        return keyListener;
    }

    public final void A(ag agVar, boolean z) {
        agVar.getClass();
        ag agVar2 = ((be) this.b).o;
        if (agVar2 != null) {
            agVar2.H().x.A(agVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
            }
        }
    }

    public final void B(ag agVar, View view, Bundle bundle, boolean z) {
        agVar.getClass();
        view.getClass();
        ag agVar2 = ((be) this.b).o;
        if (agVar2 != null) {
            agVar2.H().x.B(agVar, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
                Object obj2 = this.b;
                ax axVar = (ax) obj;
                if (agVar == axVar.a) {
                    bfi bfiVar = ((be) obj2).x;
                    synchronized (bfiVar.a) {
                        int size = ((CopyOnWriteArrayList) bfiVar.a).size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            if (((bet) ((CopyOnWriteArrayList) bfiVar.a).get(i)).a == obj) {
                                ((CopyOnWriteArrayList) bfiVar.a).remove(i);
                                break;
                            }
                            i++;
                        }
                    }
                    cop.w(view, axVar.b);
                } else {
                    continue;
                }
            }
        }
    }

    public final void C(ag agVar, boolean z) {
        agVar.getClass();
        ag agVar2 = ((be) this.b).o;
        if (agVar2 != null) {
            agVar2.H().x.C(agVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
            }
        }
    }

    public final bfh a() {
        bfe bfeVar = new bfe();
        return new bfh((aow) this.b, false, (ayr) this.a, bfeVar);
    }

    public final AutofillId b(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object obj = this.a;
            bet e = bee.e((View) this.b);
            e.getClass();
            return bef.c(apc$$ExternalSyntheticApiModelOutline0.m5m(obj), cs$$ExternalSyntheticApiModelOutline0.m(e.a), j);
        }
        return null;
    }

    public final void c() {
        Reference poll;
        do {
            poll = ((ReferenceQueue) this.a).poll();
            if (poll != null) {
                ((aiu) this.b).n(poll);
            }
        } while (poll != null);
    }

    public final Object d(int i) {
        return ((aiu) this.a).a[i];
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [mnw, java.lang.Object] */
    public final Object e(int i) {
        Object b = ((aiu) this.a).b(i);
        this.b.a();
        return b;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [mnw, java.lang.Object] */
    public final void f(int i, Object obj) {
        ((aiu) this.a).e(i, obj);
        this.b.a();
    }

    public final void g(ayr ayrVar, boolean z) {
        if (z) {
            ((axy) this.a).b(ayrVar);
            ((axy) this.b).b(ayrVar);
        } else if (!((axy) this.a).c(ayrVar)) {
            ((axy) this.b).b(ayrVar);
        }
    }

    public final boolean h(ayr ayrVar, boolean z) {
        boolean c = ((axy) this.a).c(ayrVar);
        if (!z) {
            if (!c && !((axy) this.b).c(ayrVar)) {
                return false;
            }
            return true;
        }
        return c;
    }

    public final boolean i(boolean z) {
        axy axyVar;
        if (z) {
            axyVar = (axy) this.a;
        } else {
            axyVar = (axy) this.b;
        }
        return axyVar.d();
    }

    public final boolean j() {
        if (((axy) this.b).d() && ((axy) this.a).d()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public final boolean k(long j) {
        Object obj;
        ?? r0 = ((bfi) this.a).a;
        int size = r0.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = r0.get(i);
                if (a.n(((auo) obj).a, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        auo auoVar = (auo) obj;
        if (auoVar == null) {
            return false;
        }
        return auoVar.h;
    }

    public final void l(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.a).getContext().obtainStyledAttributes(attributeSet, eb.i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            cdg cdgVar = (cdg) ((elo) this.b).b;
            if (cdgVar.a != z) {
                cdgVar.a = z;
                if (z) {
                    ccy.a();
                    throw null;
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection o(InputConnection inputConnection) {
        if (inputConnection == null) {
            return null;
        }
        if (!(inputConnection instanceof cdd)) {
            return new cdd((TextView) ((elo) this.b).a, inputConnection);
        }
        return inputConnection;
    }

    public final void p(ag agVar, Bundle bundle, boolean z) {
        agVar.getClass();
        ag agVar2 = ((be) this.b).o;
        if (agVar2 != null) {
            agVar2.H().x.p(agVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
            }
        }
    }

    public final void q(ag agVar, boolean z) {
        agVar.getClass();
        be beVar = (be) this.b;
        Context context = beVar.m.c;
        ag agVar2 = beVar.o;
        if (agVar2 != null) {
            agVar2.H().x.q(agVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
            }
        }
    }

    public final void r(ag agVar, Bundle bundle, boolean z) {
        agVar.getClass();
        ag agVar2 = ((be) this.b).o;
        if (agVar2 != null) {
            agVar2.H().x.r(agVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
            }
        }
    }

    public final void s(ag agVar, boolean z) {
        agVar.getClass();
        ag agVar2 = ((be) this.b).o;
        if (agVar2 != null) {
            agVar2.H().x.s(agVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
            }
        }
    }

    public final void t(ag agVar, boolean z) {
        agVar.getClass();
        ag agVar2 = ((be) this.b).o;
        if (agVar2 != null) {
            agVar2.H().x.t(agVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
            }
        }
    }

    public final void u(ag agVar, boolean z) {
        agVar.getClass();
        ag agVar2 = ((be) this.b).o;
        if (agVar2 != null) {
            agVar2.H().x.u(agVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
            }
        }
    }

    public final void v(ag agVar, boolean z) {
        agVar.getClass();
        be beVar = (be) this.b;
        Context context = beVar.m.c;
        ag agVar2 = beVar.o;
        if (agVar2 != null) {
            agVar2.H().x.v(agVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
            }
        }
    }

    public final void w(ag agVar, Bundle bundle, boolean z) {
        agVar.getClass();
        ag agVar2 = ((be) this.b).o;
        if (agVar2 != null) {
            agVar2.H().x.w(agVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
            }
        }
    }

    public final void x(ag agVar, boolean z) {
        agVar.getClass();
        ag agVar2 = ((be) this.b).o;
        if (agVar2 != null) {
            agVar2.H().x.x(agVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
            }
        }
    }

    public final void y(ag agVar, Bundle bundle, boolean z) {
        agVar.getClass();
        ag agVar2 = ((be) this.b).o;
        if (agVar2 != null) {
            agVar2.H().x.y(agVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
            }
        }
    }

    public final void z(ag agVar, boolean z) {
        agVar.getClass();
        ag agVar2 = ((be) this.b).o;
        if (agVar2 != null) {
            agVar2.H().x.z(agVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            bet betVar = (bet) it.next();
            if (!z) {
                Object obj = betVar.a;
            }
        }
    }

    public bfi(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public bfi(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public bfi() {
        this.b = new rm();
        this.a = new bib();
    }

    public bfi(Animator animator) {
        this.a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }

    public bfi(be beVar) {
        this.b = beVar;
        this.a = new CopyOnWriteArrayList();
    }

    public bfi(cex cexVar) {
        cexVar.getClass();
        this.b = cexVar;
        this.a = new ArrayList();
    }

    public bfi(EditText editText) {
        this.a = editText;
        this.b = new elo(editText);
    }

    public bfi(byte[] bArr, byte[] bArr2) {
        this.b = new AtomicReference(null);
        this.a = new ncd();
    }

    public bfi(char[] cArr) {
        this.a = new axy();
        this.b = new axy();
    }

    public bfi(bfh bfhVar, se seVar) {
        this.a = bfhVar.c;
        this.b = new sg((byte[]) null);
        List i = bfhVar.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            bfh bfhVar2 = (bfh) i.get(i2);
            if (se.b(seVar, bfhVar2.e)) {
                ((sg) this.b).d(bfhVar2.e);
            }
        }
    }

    public bfi(byte[] bArr) {
        this.b = new aiu(new Reference[16]);
        this.a = new ReferenceQueue();
    }
}
