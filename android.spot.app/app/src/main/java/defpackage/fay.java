package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fay extends fbg {
    public final fcn a;
    public boolean b;

    public fay(fcn fcnVar) {
        super(fcnVar.b(), fcnVar.h);
        this.a = fcnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fbg
    public final void a(fbd fbdVar) {
        String str;
        fcb fcbVar = (fcb) fbdVar.a(fcb.class);
        if (TextUtils.isEmpty(fcbVar.b)) {
            fcbVar.b = this.a.g().b();
        }
        if (this.b && TextUtils.isEmpty(fcbVar.d)) {
            fch c = this.a.c();
            c.H();
            fav b = c.b();
            String str2 = null;
            if (b != null) {
                str = b.a;
            } else {
                str = null;
            }
            boolean z = true;
            if (true != TextUtils.isEmpty(str)) {
                str2 = str;
            }
            fcbVar.d = str2;
            c.H();
            fav b2 = c.b();
            if (b2 == null || b2.b) {
                z = false;
            }
            fcbVar.e = z;
        }
    }
}
