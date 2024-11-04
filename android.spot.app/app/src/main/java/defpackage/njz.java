package defpackage;

import android.accounts.Account;
import android.content.ClipData;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.adm.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njz {
    public final /* synthetic */ Object a;

    public njz() {
        this.a = "com.google.android.gms.org.conscrypt";
    }

    public final void A(int i, int i2) {
        ((RecyclerView) this.a).K(i, i2, true);
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.N = true;
        recyclerView.M.c += i2;
    }

    public final void B(int i, int i2) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int b = recyclerView.h.b();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= b) {
                break;
            }
            View e = recyclerView.h.e(i6);
            mh h = RecyclerView.h(e);
            if (h != null && !h.x() && (i5 = h.d) >= i && i5 < i3) {
                h.c(2);
                h.B();
                ((ls) e.getLayoutParams()).e = true;
            }
            i6++;
        }
        lw lwVar = recyclerView.e;
        int size = lwVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                mh mhVar = (mh) lwVar.c.get(size);
                if (mhVar != null && (i4 = mhVar.d) >= i && i4 < i3) {
                    mhVar.c(2);
                    lwVar.i(size);
                }
            } else {
                ((RecyclerView) this.a).O = true;
                return;
            }
        }
    }

    public final int C() {
        return ((RecyclerView) this.a).getChildCount();
    }

    public final int D(View view) {
        return ((RecyclerView) this.a).indexOfChild(view);
    }

    public final View E(int i) {
        return ((RecyclerView) this.a).getChildAt(i);
    }

    public final void F(View view) {
        mh h = RecyclerView.h(view);
        if (h != null) {
            ((RecyclerView) this.a).al(h, h.n);
            h.n = 0;
        }
    }

    public final void G(int i) {
        View childAt = ((RecyclerView) this.a).getChildAt(i);
        if (childAt != null) {
            ((RecyclerView) this.a).x(childAt);
            childAt.clearAnimation();
        }
        ((RecyclerView) this.a).removeViewAt(i);
    }

    public final void H(mh mhVar, ln lnVar, ln lnVar2) {
        int i;
        int i2;
        mhVar.k(false);
        RecyclerView recyclerView = (RecyclerView) this.a;
        lo loVar = recyclerView.D;
        if (lnVar != null && ((i = lnVar.a) != (i2 = lnVar2.a) || lnVar.b != lnVar2.b)) {
            if (!loVar.i(mhVar, i, lnVar.b, i2, lnVar2.b)) {
                return;
            }
        } else {
            loVar.h(mhVar);
            mhVar.b.setAlpha(0.0f);
            loVar.c.add(mhVar);
        }
        recyclerView.O();
    }

    public final void I(mh mhVar, ln lnVar, ln lnVar2) {
        int i;
        int i2;
        ((RecyclerView) this.a).e.m(mhVar);
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.q(mhVar);
        mhVar.k(false);
        lo loVar = recyclerView.D;
        int i3 = lnVar.a;
        int i4 = lnVar.b;
        View view = mhVar.b;
        if (lnVar2 == null) {
            i = view.getLeft();
        } else {
            i = lnVar2.a;
        }
        int i5 = i;
        if (lnVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = lnVar2.b;
        }
        int i6 = i2;
        if (!mhVar.s() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            if (!loVar.i(mhVar, i3, i4, i5, i6)) {
                return;
            }
        } else {
            loVar.h(mhVar);
            loVar.b.add(mhVar);
        }
        recyclerView.O();
    }

    public final void J(mh mhVar) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.m.aN(mhVar.b, recyclerView.e);
    }

    public final boolean a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        name.getClass();
        return moz.I(name, ((String) this.a).concat("."));
    }

    public final void b(mca mcaVar) {
        if (mcaVar.f()) {
            ((mjg) this.a).c.a();
            return;
        }
        Object obj = this.a;
        ((mjg) obj).c.b(new mgs(obj, 12));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mjx] */
    public final mdg c() {
        return new mdg(this.a);
    }

    public final void d(Object obj) {
        ((bme) this.a).f(obj);
    }

    public final void e(Throwable th) {
        ((bme) this.a).g(th);
    }

    public final void f(boolean z) {
        if (!z) {
            ((kqh) ((knh) this.a).f.a()).c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jei] */
    public final Object g(Object obj) {
        return this.a.a(obj);
    }

    public final void h(TextInputLayout textInputLayout) {
        ixt ixtVar = (ixt) this.a;
        EditText editText = ixtVar.j;
        if (editText == textInputLayout.c) {
            return;
        }
        if (editText != null) {
            editText.removeTextChangedListener(ixtVar.k);
            if (((ixt) this.a).j.getOnFocusChangeListener() == ((ixt) this.a).c().d()) {
                ((ixt) this.a).j.setOnFocusChangeListener(null);
            }
        }
        ixt ixtVar2 = (ixt) this.a;
        ixtVar2.j = textInputLayout.c;
        EditText editText2 = ixtVar2.j;
        if (editText2 != null) {
            editText2.addTextChangedListener(ixtVar2.k);
        }
        ixt ixtVar3 = (ixt) this.a;
        ixtVar3.c().g(ixtVar3.j);
        ixt ixtVar4 = (ixt) this.a;
        ixtVar4.n(ixtVar4.c());
    }

    public final void i(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((iwh) this.a).f(0);
    }

    public final void j(Drawable drawable) {
        if (drawable != null) {
            super/*isg*/.setBackgroundDrawable(drawable);
        }
    }

    public final boolean k() {
        return ((FloatingActionButton) this.a).b;
    }

    public final void l() {
        ((ifo) this.a).i();
    }

    public final void m(ihy ihyVar) {
        ((iey) this.a).l.c(ihyVar);
    }

    public final void n() {
        ((hba) this.a).h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, fjr] */
    public final void o(ConnectionResult connectionResult) {
        this.a.i(connectionResult);
    }

    public final void p() {
        Object obj = this.a;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
        lottieAnimationView.c.b.removeAllListeners();
        lottieAnimationView.setVisibility(0);
        dfe dfeVar = new dfe();
        dfeVar.e = Integer.valueOf(iqg.c((View) obj, R.attr.colorSecondaryContainer));
        czw czwVar = dfeVar.d;
        if (czwVar != null) {
            czwVar.i();
        }
        lottieAnimationView.a(new dbm("**"), cyq.a, dfeVar);
    }

    public final void q(dun dunVar) {
        dyh dyhVar = (dyh) this.a;
        if (dyhVar.c.b(dunVar.a)) {
            dyhVar.k(new Account(dunVar.a, "com.google"));
            ecc eccVar = dyhVar.g;
            if (eccVar != null) {
                EditText editText = eccVar.ah.c;
                editText.getClass();
                editText.setText("");
                dyhVar.g.aG();
            }
        }
    }

    public final void r() {
        ((dyh) this.a).j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [bzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [bzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [bzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [bzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.os.Parcelable, java.lang.Object] */
    public final boolean s(bym bymVar, int i, Bundle bundle) {
        bum bumVar;
        Bundle bundle2;
        Bundle bundle3 = bundle;
        if (Build.VERSION.SDK_INT >= 25) {
            bundle3 = bundle;
            if ((i & 1) != 0) {
                try {
                    bymVar.a.e();
                    ?? d = bymVar.a.d();
                    if (bundle == null) {
                        bundle2 = new Bundle();
                    } else {
                        bundle2 = new Bundle(bundle);
                    }
                    bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", d);
                    bundle3 = bundle2;
                } catch (Exception e) {
                    Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                    return false;
                }
            }
        }
        Object obj = this.a;
        ClipData clipData = new ClipData(bymVar.a.a(), new ClipData.Item(bymVar.a.b()));
        if (Build.VERSION.SDK_INT >= 31) {
            bumVar = new bul(clipData, 2);
        } else {
            bumVar = new bun(clipData, 2);
        }
        bumVar.d(bymVar.a.c());
        bumVar.b(bundle3);
        if (bwn.c((View) obj, bqk.e(bumVar)) == null) {
            return true;
        }
        return false;
    }

    public final long t() {
        return ((ask) this.a).a();
    }

    public final void u(float f, float f2) {
        ((ask) this.a).b().f(f, f2);
    }

    public final void v(float f, float f2) {
        ask askVar = (ask) this.a;
        aqv b = askVar.b();
        long k = a.k(aqn.b(t()) - (f + 0.0f), aqn.a(t()) - (f2 + 0.0f));
        if (aqn.b(k) < 0.0f || aqn.a(k) < 0.0f) {
            jy.f("Width and height must be greater than or equal to zero");
        }
        askVar.h(k);
        b.f(0.0f, 0.0f);
    }

    public final mh w(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int b = recyclerView.h.b();
        int i2 = 0;
        mh mhVar = null;
        while (true) {
            if (i2 >= b) {
                break;
            }
            mh h = RecyclerView.h(recyclerView.h.e(i2));
            if (h != null && !h.s() && h.d == i) {
                if (recyclerView.h.k(h.b)) {
                    mhVar = h;
                } else {
                    mhVar = h;
                    break;
                }
            }
            i2++;
        }
        if (mhVar == null || ((RecyclerView) this.a).h.k(mhVar.b)) {
            return null;
        }
        return mhVar;
    }

    public final void x(ht htVar) {
        int i = htVar.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        return;
                    }
                    ((RecyclerView) this.a).m.y(htVar.b, htVar.d);
                    return;
                } else {
                    lr lrVar = ((RecyclerView) this.a).m;
                    int i2 = htVar.b;
                    int i3 = htVar.d;
                    Object obj = htVar.c;
                    lrVar.A(i2, i3);
                    return;
                }
            }
            ((RecyclerView) this.a).m.z(htVar.b, htVar.d);
            return;
        }
        ((RecyclerView) this.a).m.w(htVar.b, htVar.d);
    }

    public final void y(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int b = recyclerView.h.b();
        for (int i3 = 0; i3 < b; i3++) {
            mh h = RecyclerView.h(recyclerView.h.e(i3));
            if (h != null && !h.x() && h.d >= i) {
                h.h(i2, false);
                recyclerView.M.f = true;
            }
        }
        lw lwVar = recyclerView.e;
        int size = lwVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            mh mhVar = (mh) lwVar.c.get(i4);
            if (mhVar != null && mhVar.d >= i) {
                mhVar.h(i2, false);
            }
        }
        recyclerView.requestLayout();
        ((RecyclerView) this.a).N = true;
    }

    public final void z(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int b = recyclerView.h.b();
        int i9 = 0;
        while (true) {
            int i10 = -1;
            if (i9 >= b) {
                break;
            }
            mh h = RecyclerView.h(recyclerView.h.e(i9));
            if (h != null) {
                if (i < i2) {
                    i7 = i;
                } else {
                    i7 = i2;
                }
                int i11 = h.d;
                if (i11 >= i7) {
                    if (i < i2) {
                        i8 = i2;
                    } else {
                        i8 = i;
                    }
                    if (i11 <= i8) {
                        if (i11 == i) {
                            h.h(i2 - i, false);
                        } else {
                            if (i >= i2) {
                                i10 = 1;
                            }
                            h.h(i10, false);
                        }
                        recyclerView.M.f = true;
                    }
                }
            }
            i9++;
        }
        lw lwVar = recyclerView.e;
        if (i < i2) {
            i3 = i2;
        } else {
            i3 = i;
        }
        if (i < i2) {
            i4 = i;
        } else {
            i4 = i2;
        }
        int size = lwVar.c.size();
        for (int i12 = 0; i12 < size; i12++) {
            mh mhVar = (mh) lwVar.c.get(i12);
            if (mhVar != null && (i5 = mhVar.d) >= i4 && i5 <= i3) {
                if (i5 == i) {
                    mhVar.h(i2 - i, false);
                } else {
                    if (i < i2) {
                        i6 = -1;
                    } else {
                        i6 = 1;
                    }
                    mhVar.h(i6, false);
                }
            }
        }
        recyclerView.requestLayout();
        ((RecyclerView) this.a).N = true;
    }

    public /* synthetic */ njz(Object obj) {
        this.a = obj;
    }

    public njz(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
