package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.view.ViewGroup;
import java.lang.ref.Reference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqr {
    private static boolean g = true;
    public final ViewGroup a;
    public boolean d;
    public boolean e;
    private atl h;
    public final Object b = new Object();
    public final asy c = new asy(new bet((byte[]) null, (char[]) null));
    public final bbs f = new bbs(this, 1);

    public aqr(ViewGroup viewGroup) {
        this.a = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            b(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new bba(this, 1));
    }

    private final atl c(ViewGroup viewGroup) {
        atl atlVar = this.h;
        if (atlVar == null) {
            atn atnVar = new atn(viewGroup.getContext());
            viewGroup.addView(atnVar);
            this.h = atnVar;
            return atnVar;
        }
        return atlVar;
    }

    public final asq a() {
        byte[] bArr;
        Object obj;
        asq asqVar;
        ass aswVar;
        synchronized (this.b) {
            ViewGroup viewGroup = this.a;
            if (Build.VERSION.SDK_INT >= 29) {
                aqq.a(viewGroup);
            }
            atk atkVar = this.c.b;
            atkVar.a();
            while (true) {
                Object obj2 = atkVar.a;
                bArr = null;
                if (((aiu) obj2).m()) {
                    obj = ((Reference) ((aiu) obj2).b(((aiu) obj2).b - 1)).get();
                    if (obj != null) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            asqVar = (asq) obj;
            if (asqVar != null) {
                asqVar.h = false;
                asqVar.a.o();
                asqVar.d = wo.s;
                asqVar.l = true;
                asqVar.h(1.0f);
                ass assVar = asqVar.a;
                if (!a.m(assVar.h(), 3)) {
                    assVar.H();
                }
                if (!amr.i(null, null)) {
                    asqVar.a.G();
                }
                asqVar.m(9205357640488583168L);
                asqVar.p(1.0f);
                asqVar.q(1.0f);
                asqVar.u(0.0f);
                asqVar.v(0.0f);
                asqVar.o(0.0f);
                asqVar.i(aqx.a);
                asqVar.s(aqx.a);
                asqVar.j(8.0f);
                asqVar.x();
                asqVar.l(0);
                asqVar.k(false);
                asqVar.r(0L);
                asqVar.t(0L);
                asqVar.n(0L, 9205357640488583168L);
                asqVar.l = false;
            } else {
                asqVar = null;
            }
            if (asqVar == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    aswVar = new asu(bArr);
                } else if (g && Build.VERSION.SDK_INT >= 23) {
                    try {
                        aswVar = new ast(this.a, new bet((byte[]) null, (char[]) null), new asl());
                    } catch (Throwable unused) {
                        g = false;
                        aswVar = new asw(c(this.a));
                    }
                } else {
                    aswVar = new asw(c(this.a));
                }
                asqVar = new asq(aswVar, this.c);
            }
            asy asyVar = this.c;
            asyVar.d.i(asqVar);
            if (!asyVar.c.hasMessages(0)) {
                asyVar.c.sendMessageAtFrontOfQueue(Message.obtain());
            }
        }
        return asqVar;
    }

    public final void b(Context context) {
        if (!this.d) {
            context.getApplicationContext().registerComponentCallbacks(this.f);
            this.d = true;
        }
    }
}
