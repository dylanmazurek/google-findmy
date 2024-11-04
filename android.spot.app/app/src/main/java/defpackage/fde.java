package defpackage;

import android.util.DisplayMetrics;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fde extends fcl {
    public fde(fcn fcnVar) {
        super(fcnVar);
    }

    public final fbx b() {
        H();
        DisplayMetrics displayMetrics = h().b.getResources().getDisplayMetrics();
        fbx fbxVar = new fbx();
        fbxVar.a = fma.bi(Locale.getDefault());
        fbxVar.b = displayMetrics.widthPixels;
        fbxVar.c = displayMetrics.heightPixels;
        return fbxVar;
    }

    @Override // defpackage.fcl
    protected final void a() {
    }
}
