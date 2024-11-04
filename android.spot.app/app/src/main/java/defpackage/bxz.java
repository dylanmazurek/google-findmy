package defpackage;

import android.view.WindowInsets;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        int statusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 256; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                i2 |= statusBars;
            }
        }
        return i2;
    }

    public static final int b(ckb ckbVar, String str) {
        int a = ckbVar.a();
        for (int i = 0; i < a; i++) {
            if (amr.i(str, ckbVar.c(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final int c(ckb ckbVar, String str) {
        int d = byj.d(ckbVar, str);
        if (d >= 0) {
            return d;
        }
        int a = ckbVar.a();
        ArrayList arrayList = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            arrayList.add(ckbVar.c(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + mkm.ar(arrayList, null, null, null, null, 63) + ']');
    }
}
