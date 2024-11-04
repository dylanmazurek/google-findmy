package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzq {
    public static final ClipData a = ClipData.newIntent("", new Intent());

    public static Intent a(Intent intent, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        if ((i & 88) == 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.K(z, "Cannot set any dangerous parts of intent to be mutable.");
        if ((i & 1) != 0 && !b(0, 3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        hwx.K(z2, "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        if ((i & 2) != 0 && !b(0, 5)) {
            z3 = false;
        } else {
            z3 = true;
        }
        hwx.K(z3, "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        if ((i & 4) != 0 && !b(0, 9)) {
            z4 = false;
        } else {
            z4 = true;
        }
        hwx.K(z4, "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        if ((i & 128) != 0 && !b(0, 17)) {
            z5 = false;
        } else {
            z5 = true;
        }
        hwx.K(z5, "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        if (intent.getComponent() != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        hwx.K(z6, "Must set component on Intent.");
        if (b(0, 1)) {
            hwx.K(!b(i, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !b(i, 67108864)) {
                z7 = false;
            }
            hwx.K(z7, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !b(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(a);
            }
        }
        return intent2;
    }

    private static boolean b(int i, int i2) {
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }
}
