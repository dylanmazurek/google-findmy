package defpackage;

import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class baj extends bai {
    public static baj b;
    public final BreakIterator c;

    public baj(Locale locale) {
        this.c = BreakIterator.getCharacterInstance(locale);
    }

    @Override // defpackage.ban
    public final int[] c(int i) {
        int length = a().length();
        if (length > 0 && i < length) {
            if (i < 0) {
                i = 0;
            }
            while (true) {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    mpd.b("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.c;
                    if (breakIterator2 == null) {
                        mpd.b("impl");
                        breakIterator2 = null;
                    }
                    i = breakIterator2.following(i);
                    if (i == -1) {
                        break;
                    }
                } else {
                    BreakIterator breakIterator3 = this.c;
                    if (breakIterator3 == null) {
                        mpd.b("impl");
                        breakIterator3 = null;
                    }
                    int following = breakIterator3.following(i);
                    if (following != -1) {
                        return b(i, following);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.ban
    public final int[] d(int i) {
        int length = a().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            while (true) {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    mpd.b("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.c;
                    if (breakIterator2 == null) {
                        mpd.b("impl");
                        breakIterator2 = null;
                    }
                    i = breakIterator2.preceding(i);
                    if (i == -1) {
                        break;
                    }
                } else {
                    BreakIterator breakIterator3 = this.c;
                    if (breakIterator3 == null) {
                        mpd.b("impl");
                        breakIterator3 = null;
                    }
                    int preceding = breakIterator3.preceding(i);
                    if (preceding != -1) {
                        return b(preceding, i);
                    }
                }
            }
        }
        return null;
    }
}
