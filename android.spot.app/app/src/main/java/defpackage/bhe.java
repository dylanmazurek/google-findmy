package defpackage;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhe {
    public static final void a(StaticLayout.Builder builder, int i, int i2) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        lineBreakStyle = new LineBreakConfig.Builder().setLineBreakStyle(i);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i2);
        build = lineBreakWordStyle.build();
        builder.setLineBreakConfig(build);
    }

    public static final boolean b(StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    public static final int c(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return 3;
            }
        } else if (z) {
            return 1;
        }
        if (!z2) {
            return 0;
        }
        return 2;
    }

    public static final int d(biz bizVar) {
        boolean z;
        if (bizVar.compareTo(biz.c) >= 0) {
            z = true;
        } else {
            z = false;
        }
        return c(z, a.m(0, 1));
    }
}
