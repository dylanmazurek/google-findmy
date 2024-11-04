package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffc extends fey {
    public static final List l = new CopyOnWriteArrayList();
    public final List m;

    public ffc(Context context, String str, String str2) {
        this(context, str, str2, ffm.a, new ffu(context, new eft(6)), new ffy(context), new eft(5), null);
    }

    public static ffc i(Context context, String str) {
        fex fexVar = new fex(context, str);
        fexVar.b(ffm.b);
        return fexVar.a();
    }

    public static void j(ffa ffaVar) {
        l.add(0, ffaVar);
    }

    public static fex k(Context context, String str) {
        fex fexVar = new fex(context, str);
        fexVar.b(ffm.c);
        return fexVar;
    }

    @Deprecated
    public final ffb g(lkq lkqVar) {
        fma.aR(lkqVar);
        return new ffb(this, lkqVar);
    }

    public final ffb h(lkq lkqVar, ffl fflVar) {
        fma.aR(lkqVar);
        ffb ffbVar = new ffb(this, lkqVar);
        fma.aR(fflVar);
        ffbVar.q = fflVar;
        return ffbVar;
    }

    public ffc(Context context, String str, String str2, ffm ffmVar, ffd ffdVar, ffk ffkVar, jfe jfeVar, fff fffVar) {
        super(context, str, str2, ffmVar, ffdVar, ffkVar, jfeVar, fffVar);
        this.m = new CopyOnWriteArrayList();
    }
}
