package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqb {
    public final Context a;
    public final Notification.Builder b;
    public final bpm c;
    public RemoteViews d;
    public final Bundle e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r1v26, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.os.Parcelable[]] */
    /* JADX WARN: Type inference failed for: r6v33, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.Bundle] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bqb(defpackage.bpm r18) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqb.<init>(bpm):void");
    }

    public static final void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    private final void b(bpg bpgVar) {
        int i;
        Notification.Action.Builder c;
        IconCompat a = bpgVar.a();
        if (Build.VERSION.SDK_INT >= 23) {
            Icon icon = null;
            if (a != null) {
                icon = a.f(null);
            }
            c = bpv.a(icon, bpgVar.f, bpgVar.g);
        } else {
            if (a != null) {
                i = a.a();
            } else {
                i = 0;
            }
            c = bpt.c(i, bpgVar.f, bpgVar.g);
        }
        bqm[] bqmVarArr = bpgVar.b;
        if (bqmVarArr != null) {
            int length = bqmVarArr.length;
            RemoteInput[] remoteInputArr = new RemoteInput[length];
            for (int i2 = 0; i2 < bqmVarArr.length; i2++) {
                remoteInputArr[i2] = bqj.h(bqmVarArr[i2]);
            }
            for (int i3 = 0; i3 < length; i3++) {
                bpt.b(c, remoteInputArr[i3]);
            }
        }
        Bundle bundle = new Bundle(bpgVar.a);
        boolean z = bpgVar.c;
        bundle.putBoolean("android.support.allowGeneratedReplies", true);
        if (Build.VERSION.SDK_INT >= 24) {
            boolean z2 = bpgVar.c;
            bpw.a(c, true);
        }
        bundle.putInt("android.support.action.semanticAction", 0);
        if (Build.VERSION.SDK_INT >= 28) {
            bpy.c(c, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            bpz.a(c, false);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            bqa.a(c, false);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bpgVar.d);
        bpt.a(c, bundle);
        bpt.e(this.b, bpt.d(c));
    }
}
