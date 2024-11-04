package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bry extends bsb {
    private static int f(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        int i;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        if (slant == slant2) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.graphics.fonts.Font g(android.graphics.fonts.FontFamily r6, int r7) {
        /*
            r0 = r7 & 1
            android.graphics.fonts.FontStyle r1 = new android.graphics.fonts.FontStyle
            r2 = 1
            if (r2 == r0) goto La
            r0 = 400(0x190, float:5.6E-43)
            goto Lc
        La:
            r0 = 700(0x2bc, float:9.81E-43)
        Lc:
            r7 = r7 & 2
            r3 = 0
            if (r7 == 0) goto L13
            r7 = 1
            goto L14
        L13:
            r7 = 0
        L14:
            r1.<init>(r0, r7)
            android.graphics.fonts.Font r7 = defpackage.jh$$ExternalSyntheticApiModelOutline0.m(r6, r3)
            android.graphics.fonts.FontStyle r0 = defpackage.jh$$ExternalSyntheticApiModelOutline0.m(r7)
            int r0 = f(r1, r0)
        L23:
            int r3 = defpackage.jh$$ExternalSyntheticApiModelOutline0.m(r6)
            if (r2 >= r3) goto L41
            android.graphics.fonts.Font r3 = defpackage.jh$$ExternalSyntheticApiModelOutline0.m(r6, r2)
            android.graphics.fonts.FontStyle r4 = defpackage.jh$$ExternalSyntheticApiModelOutline0.m(r3)
            int r4 = f(r1, r4)
            if (r4 >= r0) goto L39
            r5 = r4
            goto L3a
        L39:
            r5 = r0
        L3a:
            if (r4 >= r0) goto L3d
            r7 = r3
        L3d:
            int r2 = r2 + 1
            r0 = r5
            goto L23
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bry.g(android.graphics.fonts.FontFamily, int):android.graphics.fonts.Font");
    }

    @Override // defpackage.bsb
    public final Typeface a(Context context, btq[] btqVarArr, int i) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font build3;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (btq btqVar : btqVarArr) {
                try {
                    ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(btqVar.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            weight = new Font.Builder(openFileDescriptor).setWeight(btqVar.c);
                            slant = weight.setSlant(btqVar.d ? 1 : 0);
                            ttcIndex = slant.setTtcIndex(btqVar.b);
                            build3 = ttcIndex.build();
                            if (builder != null) {
                                builder.addFont(build3);
                            } else {
                                builder = new FontFamily.Builder(build3);
                            }
                            openFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
            style = g(build, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.bsb
    public final Typeface b(Context context, bet betVar, Resources resources, int i) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font.Builder fontVariationSettings;
        Font build3;
        try {
            Object obj = betVar.a;
            int length = ((bre[]) obj).length;
            FontFamily.Builder builder = null;
            for (int i2 = 0; i2 < length; i2++) {
                bre breVar = ((bre[]) obj)[i2];
                try {
                    weight = new Font.Builder(resources, breVar.f).setWeight(breVar.b);
                    slant = weight.setSlant(breVar.c ? 1 : 0);
                    ttcIndex = slant.setTtcIndex(breVar.e);
                    fontVariationSettings = ttcIndex.setFontVariationSettings(breVar.d);
                    build3 = fontVariationSettings.build();
                    if (builder != null) {
                        builder.addFont(build3);
                    } else {
                        builder = new FontFamily.Builder(build3);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
            style = g(build, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.bsb
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Font build;
        FontFamily build2;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build3;
        try {
            build = new Font.Builder(resources, i).build();
            build2 = new FontFamily.Builder(build).build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
            style = build.getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build3 = style2.build();
            return build3;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bsb
    public final Typeface k(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bsb
    public final btq l(btq[] btqVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
