package defpackage;

import android.text.Html;
import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Spanned a(String str, int i) {
        Spanned fromHtml;
        fromHtml = Html.fromHtml(str, i);
        return fromHtml;
    }

    static Spanned b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        Spanned fromHtml;
        fromHtml = Html.fromHtml(str, i, imageGetter, tagHandler);
        return fromHtml;
    }

    static String c(Spanned spanned, int i) {
        String html;
        html = Html.toHtml(spanned, i);
        return html;
    }

    public static final cfk d(cfk cfkVar) {
        cfm cfmVar;
        mpk mpkVar = new mpk();
        mpkVar.a = true;
        if (cfkVar.n()) {
            mpkVar.a = false;
            cfmVar = new cfm(cfkVar.d());
        } else {
            cfmVar = new cfm();
        }
        cfmVar.o(cfkVar, new edk(new tn(cfmVar, mpkVar, 18), 1));
        return cfmVar;
    }

    public static final cfk e(cfk cfkVar, moh mohVar) {
        cfm cfmVar;
        cfkVar.getClass();
        if (cfkVar.n()) {
            cfmVar = new cfm(mohVar.a(cfkVar.d()));
        } else {
            cfmVar = new cfm();
        }
        cfmVar.o(cfkVar, new edk(new tn(cfmVar, mohVar, 19), 1));
        return cfmVar;
    }
}
