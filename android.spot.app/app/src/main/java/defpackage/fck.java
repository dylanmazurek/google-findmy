package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fck {
    public final fcn c;

    /* JADX INFO: Access modifiers changed from: protected */
    public fck(fcn fcnVar) {
        fma.aR(fcnVar);
        this.c = fcnVar;
    }

    public static final void F() {
    }

    private static String a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            if (obj == Boolean.TRUE) {
                return "true";
            }
            return "false";
        }
        if (obj instanceof Throwable) {
            return ((Throwable) obj).toString();
        }
        return obj.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String q(String str, Object obj, Object obj2, Object obj3) {
        String str2;
        String a = a(obj);
        String a2 = a(obj2);
        String a3 = a(obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        } else {
            str2 = "";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str3);
            sb.append(a3);
        }
        return sb.toString();
    }

    public final void A(String str, Object obj, Object obj2) {
        E(2, str, obj, obj2, null);
    }

    public final void B(String str) {
        E(5, str, null, null, null);
    }

    public final void C(String str, Object obj) {
        E(5, str, obj, null, null);
    }

    public final void D(String str, Object obj, Object obj2) {
        E(5, str, obj, obj2, null);
    }

    public final void E(int i, String str, Object obj, Object obj2, Object obj3) {
        fdn fdnVar;
        fcn fcnVar = this.c;
        if (fcnVar != null) {
            fdnVar = fcnVar.d;
        } else {
            fdnVar = null;
        }
        fdn fdnVar2 = fdnVar;
        if (fdnVar2 != null) {
            String str2 = (String) fdh.b.x();
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, fdn.q(str, obj, obj2, obj3));
            }
            if (i >= 5) {
                fdnVar2.d(i, str, obj, obj2, obj3);
                return;
            }
            return;
        }
        String str3 = (String) fdh.b.x();
        if (Log.isLoggable(str3, i)) {
            Log.println(i, str3, q(str, obj, obj2, obj3));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G() {
        flt fltVar = this.c.h;
    }

    public final Context f() {
        return this.c.a;
    }

    public final fbb g() {
        return this.c.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final fbm h() {
        return this.c.b();
    }

    public final fcj i() {
        return this.c.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final fda j() {
        return this.c.g();
    }

    public final fdc k() {
        return this.c.c;
    }

    public final fde l() {
        return this.c.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final fdf m() {
        fcn fcnVar = this.c;
        fcn.j(fcnVar.e);
        return fcnVar.e;
    }

    public final fdn n() {
        return this.c.h();
    }

    public final fdr o() {
        fcn fcnVar = this.c;
        fcn.j(fcnVar.f);
        return fcnVar.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final fdw p() {
        return this.c.i();
    }

    public final void r(String str) {
        E(3, str, null, null, null);
    }

    public final void s(String str, Object obj) {
        E(3, str, obj, null, null);
    }

    public final void t(String str, Object obj, Object obj2) {
        E(3, str, obj, obj2, null);
    }

    public final void u(String str) {
        E(6, str, null, null, null);
    }

    public final void v(String str, Object obj) {
        E(6, str, obj, null, null);
    }

    public final void w(String str, Object obj, Object obj2) {
        E(6, str, obj, obj2, null);
    }

    public final void x(String str, Object obj) {
        E(4, str, obj, null, null);
    }

    public final void y(String str) {
        E(2, str, null, null, null);
    }

    public final void z(String str, Object obj) {
        E(2, str, obj, null, null);
    }
}
