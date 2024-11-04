package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iym {
    public static final jck d = new jck("AppUpdateService");
    private static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public izc a;
    public final String b;
    public final Context c;
    public final jck e;

    public iym(Context context, jck jckVar) {
        this.b = context.getPackageName();
        this.c = context;
        this.e = jckVar;
        jck jckVar2 = ize.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr != null && (signatureArr.length) != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String l = iqg.l(signature.toByteArray());
                            arrayList.add(l);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(l) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(l))) {
                                this.a = new izc(iqg.m(context), d, f);
                                return;
                            }
                        }
                        jck jckVar3 = ize.a;
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                } else {
                                    sb.append((CharSequence) ", ");
                                }
                            }
                        }
                        jckVar3.k(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", sb.toString()), new Object[0]);
                        return;
                    }
                    ize.a.k("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                } catch (PackageManager.NameNotFoundException unused) {
                    ize.a.k("Play Store package is not found.", new Object[0]);
                    return;
                }
            }
            ize.a.k("Play Store package is disabled.", new Object[0]);
        } catch (PackageManager.NameNotFoundException unused2) {
            ize.a.k("Play Store package is not found.", new Object[0]);
        }
    }

    public static int a(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    public static HashSet b(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }
}
