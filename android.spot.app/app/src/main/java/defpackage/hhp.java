package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.CrossProfileApps;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hhp implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ hhp(CrossProfileApps crossProfileApps, UserHandle userHandle, hri hriVar, Context context, int i) {
        this.e = i;
        this.d = crossProfileApps;
        this.c = userHandle;
        this.b = hriVar;
        this.a = context;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, hjp] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, hjp] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List targetUserProfiles;
        List targetUserProfiles2;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                this.b.f(new bym(5), view);
                ((hid) this.c).b.b = (hjq) this.a;
                ((hia) this.d).g(view);
                return;
            }
            String str = hch.a;
            Context applicationContext = view.getContext().getApplicationContext();
            Object obj = this.d;
            targetUserProfiles = he$$ExternalSyntheticApiModelOutline0.m(obj).getTargetUserProfiles();
            Object obj2 = this.c;
            boolean contains = targetUserProfiles.contains(obj2);
            Object obj3 = this.b;
            if (!contains) {
                if (obj3 != null) {
                    ((hri) obj3).m(new gno(obj3, applicationContext.getPackageName(), 19));
                }
                Log.e(hch.a, "Trying to switch to a non-existing profile");
                return;
            }
            Context context = (Context) this.a;
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
            if (launchIntentForPackage == null) {
                Log.e(hch.a, "getLaunchIntentForPackage return null for package ".concat(String.valueOf(packageName)));
                return;
            }
            ComponentName component = launchIntentForPackage.getComponent();
            if (component == null) {
                Log.e(hch.a, "Launch component was null for package ".concat(String.valueOf(packageName)));
                return;
            }
            String str2 = "OK";
            try {
                try {
                    he$$ExternalSyntheticApiModelOutline0.m(obj).startMainActivity(component, (UserHandle) obj2);
                    if (obj3 != null) {
                        return;
                    } else {
                        return;
                    }
                } catch (SecurityException e) {
                    str2 = "SecurityException";
                    throw e;
                }
            } finally {
                if (obj3 != null) {
                    boolean hasCategory = launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER");
                    boolean hasCategory2 = launchIntentForPackage.hasCategory("android.intent.category.INFO");
                    targetUserProfiles2 = he$$ExternalSyntheticApiModelOutline0.m(obj).getTargetUserProfiles();
                    ((hri) obj3).j(str2, hasCategory, hasCategory2, targetUserProfiles2.contains(obj2), Build.VERSION.SDK_INT, applicationContext.getPackageName());
                }
            }
        }
        this.b.f(new bym(5), view);
        Object a = ((hid) this.d).b.a();
        ((hia) this.a).d((hig) this.c, a);
    }

    public /* synthetic */ hhp(hia hiaVar, hjp hjpVar, hid hidVar, hjq hjqVar, int i) {
        this.e = i;
        this.d = hiaVar;
        this.b = hjpVar;
        this.c = hidVar;
        this.a = hjqVar;
    }

    public /* synthetic */ hhp(hia hiaVar, hjp hjpVar, hig higVar, hid hidVar, int i) {
        this.e = i;
        this.a = hiaVar;
        this.b = hjpVar;
        this.c = higVar;
        this.d = hidVar;
    }
}
