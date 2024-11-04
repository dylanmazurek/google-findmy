package defpackage;

import android.content.Intent;
import android.os.LocaleList;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static LocaleList a(String str) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(str);
        return forLanguageTags;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }

    public static final Intent c(String[] strArr) {
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        putExtra.getClass();
        return putExtra;
    }

    public static final boolean d(long j) {
        if ((j & 9223372034707292159L) == 9205357640488583168L) {
            return true;
        }
        return false;
    }

    public static final aql e(aqj aqjVar) {
        return new aql(aqjVar.a, aqjVar.b, aqjVar.c, aqjVar.d);
    }
}
