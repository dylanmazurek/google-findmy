package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fey {
    static final ExperimentTokens[] a = new ExperimentTokens[0];
    static final String[] b = new String[0];

    @Deprecated
    public static final gok k;
    private static volatile int l = -1;
    private static final fma m;
    public final ffk c;
    public final String d;
    protected final Context e;
    public final ffd f;
    protected final String g;
    protected final String h;
    protected final ffm i;
    public final fff j;

    static {
        few fewVar = new few();
        m = fewVar;
        k = new gok("ClearcutLogger.API", fewVar, (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public fey(Context context, String str, String str2, ffm ffmVar, ffd ffdVar, ffk ffkVar, jfe jfeVar, fff fffVar) {
        boolean z;
        if (!ffmVar.a(ffn.ACCOUNT_NAME)) {
            if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            fma.aG(z, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        d(ffmVar);
        this.e = context.getApplicationContext();
        this.h = context.getPackageName();
        this.g = str;
        this.d = str2;
        this.i = ffmVar;
        this.f = ffdVar == null ? new ffu(context, jfeVar) : ffdVar;
        this.c = ffkVar == null ? new ffy(context) : ffkVar;
        this.j = fffVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(Context context) {
        if (l == -1) {
            synchronized (fey.class) {
                if (l == -1) {
                    try {
                        l = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("AbstractClearcutLogger", "This can't happen.", e);
                    }
                }
            }
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String c(Iterable iterable) {
        return new jen(", ").c(iterable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(ffm ffmVar) {
        if (!ffmVar.equals(ffm.c) && !ffmVar.equals(ffm.a) && !ffmVar.equals(ffm.b)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int[] f(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    public final boolean e() {
        return this.i.equals(ffm.b);
    }
}
