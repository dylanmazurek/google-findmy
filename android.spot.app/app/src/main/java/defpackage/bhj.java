package defpackage;

import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhj {
    public static final Layout.Alignment a;
    public static final Layout.Alignment b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
        for (Layout.Alignment alignment3 : values) {
            if (amr.i(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (amr.i(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        a = alignment;
        b = alignment2;
    }
}
