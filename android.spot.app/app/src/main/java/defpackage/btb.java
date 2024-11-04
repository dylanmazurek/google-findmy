package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class btb implements bta {
    private final LocaleList a;

    public btb(Object obj) {
        this.a = ct$$ExternalSyntheticApiModelOutline0.m73m(obj);
    }

    @Override // defpackage.bta
    public final int a() {
        int size;
        size = this.a.size();
        return size;
    }

    @Override // defpackage.bta
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.bta
    public final String c() {
        String languageTags;
        languageTags = this.a.toLanguageTags();
        return languageTags;
    }

    @Override // defpackage.bta
    public final Locale d(int i) {
        Locale locale;
        locale = this.a.get(i);
        return locale;
    }

    @Override // defpackage.bta
    public final boolean e() {
        boolean isEmpty;
        isEmpty = this.a.isEmpty();
        return isEmpty;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.a.equals(((bta) obj).b());
        return equals;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        return hashCode;
    }

    public final String toString() {
        String localeList;
        localeList = this.a.toString();
        return localeList;
    }
}
