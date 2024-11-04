package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atk {
    public final Object a;
    public final Object b;

    public atk(TextView textView) {
        this.b = textView;
        this.a = new ddh(textView);
    }

    public final void a() {
        Reference poll;
        do {
            poll = ((ReferenceQueue) this.b).poll();
            if (poll != null) {
                ((aiu) this.a).n(poll);
            }
        } while (poll != null);
    }

    public final ln c(mh mhVar, int i) {
        np npVar;
        ln lnVar;
        int b = ((ta) this.b).b(mhVar);
        if (b >= 0 && (npVar = (np) ((ta) this.b).f(b)) != null) {
            int i2 = npVar.b;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                npVar.b = i3;
                if (i == 4) {
                    lnVar = npVar.c;
                } else if (i == 8) {
                    lnVar = npVar.d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    ((ta) this.b).d(b);
                    np.b(npVar);
                }
                return lnVar;
            }
        }
        return null;
    }

    public final void d(mh mhVar) {
        np npVar = (np) ((ta) this.b).get(mhVar);
        if (npVar == null) {
            Object obj = this.b;
            np a = np.a();
            ((ta) obj).put(mhVar, a);
            npVar = a;
        }
        npVar.b |= 1;
    }

    public final void e(long j, mh mhVar) {
        ((sl) this.a).j(j, mhVar);
    }

    public final void f(mh mhVar, ln lnVar) {
        np npVar = (np) ((ta) this.b).get(mhVar);
        if (npVar == null) {
            Object obj = this.b;
            np a = np.a();
            ((ta) obj).put(mhVar, a);
            npVar = a;
        }
        npVar.d = lnVar;
        npVar.b |= 8;
    }

    public final void g(mh mhVar, ln lnVar) {
        np npVar = (np) ((ta) this.b).get(mhVar);
        if (npVar == null) {
            Object obj = this.b;
            np a = np.a();
            ((ta) obj).put(mhVar, a);
            npVar = a;
        }
        npVar.c = lnVar;
        npVar.b |= 4;
    }

    public final void h() {
        ((ta) this.b).clear();
        ((sl) this.a).i();
    }

    public final void i(mh mhVar) {
        np npVar = (np) ((ta) this.b).get(mhVar);
        if (npVar == null) {
            return;
        }
        npVar.b &= -2;
    }

    public final void j(mh mhVar) {
        int b = ((sl) this.a).b();
        while (true) {
            b--;
            if (b < 0) {
                break;
            }
            if (mhVar == ((sl) this.a).g(b)) {
                sl slVar = (sl) this.a;
                Object[] objArr = slVar.c;
                Object obj = objArr[b];
                Object obj2 = sm.a;
                if (obj != obj2) {
                    objArr[b] = obj2;
                    slVar.a = true;
                }
            }
        }
        np npVar = (np) ((ta) this.b).remove(mhVar);
        if (npVar != null) {
            np.b(npVar);
        }
    }

    public final boolean k(mh mhVar) {
        np npVar = (np) ((ta) this.b).get(mhVar);
        if (npVar != null && (npVar.b & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [no, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [no, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [no, java.lang.Object] */
    public final View l(int i, int i2, int i3, int i4) {
        ?? r0 = this.b;
        int d = r0.d();
        int c = r0.c();
        View view = null;
        int i5 = i;
        while (i5 != i2) {
            ?? r4 = this.b;
            View e = r4.e(i5);
            ((nn) this.a).c(d, c, r4.b(e), this.b.a(e));
            ((nn) this.a).b();
            ((nn) this.a).a(i3);
            nn nnVar = (nn) this.a;
            if (!nnVar.d()) {
                nnVar.b();
                ((nn) this.a).a(i4);
                int i6 = 1;
                if (true == ((nn) this.a).d()) {
                    view = e;
                }
                if (i2 <= i) {
                    i6 = -1;
                }
                i5 += i6;
            } else {
                return e;
            }
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [no, java.lang.Object] */
    public final boolean m(View view) {
        Object obj = this.a;
        ?? r1 = this.b;
        ((nn) obj).c(r1.d(), r1.c(), r1.b(view), r1.a(view));
        ((nn) this.a).b();
        ((nn) this.a).a(24579);
        return ((nn) this.a).d();
    }

    public final void n() {
        ((SparseIntArray) this.b).clear();
    }

    public final void o() {
        ((SparseIntArray) this.a).clear();
    }

    public final void p(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((TextView) this.b).getContext().obtainStyledAttributes(attributeSet, eb.i, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(14)) {
                obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            cdf.p();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public atk(moh mohVar, moh mohVar2) {
        this.b = mohVar;
        this.a = mohVar2;
    }

    public atk(no noVar) {
        this.b = noVar;
        this.a = new nn();
    }

    public atk(xe xeVar, muf mufVar) {
        this.a = xeVar;
        this.b = mufVar;
    }

    public atk(byte[] bArr) {
        this.a = new AtomicReference(null);
        this.b = new ncd();
    }

    public atk(byte[] bArr, byte[] bArr2) {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }

    public atk(char[] cArr) {
        this.b = new ta();
        this.a = new sl();
    }

    public atk() {
        this.a = new aiu(new Reference[16]);
        this.b = new ReferenceQueue();
    }
}
