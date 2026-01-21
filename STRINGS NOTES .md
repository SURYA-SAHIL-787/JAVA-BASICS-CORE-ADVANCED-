SECTION 6 — STRINGS (Q421–Q520) — NOTES
STRING BASICS

String is a sequence of characters.

Strings are objects in Java, not primitive.

Strings are immutable; any modification creates a new string.

String problems mainly involve traversal, comparison, transformation, and validation.

STRING INPUT AND TRAVERSAL

Full line input is required when spaces are present.

Traversal is done character by character using loops.

Traversal is the base for most string operations.

Index control is critical for correctness.

CHARACTER CLASSIFICATION

Vowels include a, e, i, o, u (both cases).

Consonants are alphabets excluding vowels.

Digits range from 0 to 9.

Spaces and special characters must be handled separately.

ASCII value ranges are commonly used for manual checks.

Case normalization simplifies comparisons.

COUNTING-BASED STRING LOGIC

Counters are used for characters, vowels, digits, spaces, and words.

Initialize counters before traversal.

Increment counters based on conditions.

These questions are very common in exams.

STRING REVERSAL

Reversal reads characters from end to start.

Can be done using loop or StringBuilder.

Used as base for palindrome and word reversal problems.

PALINDROME CHECKING

Palindrome reads the same forward and backward.

Case-insensitive checks require normalization.

Some problems ignore spaces or special characters.

Comparison can be done using reversed string or two pointers.

STRING COMPARISON

== compares memory reference.

equals() compares actual content.

Lexicographical comparison is based on ASCII values.

Manual comparison checks characters one by one.

WORD-LEVEL STRING PROCESSING

Words are separated using spaces.

Word count depends on clean space handling.

Operations include longest word, shortest word, and word length.

Extra spaces must be trimmed or reduced.

Reversal can be applied to word order or individual words.

STRING CLEANING

Removing spaces may remove all or extra spaces only.

Multiple spaces can be reduced to single space.

Punctuation removal is required for clean word processing.

CASE TRANSFORMATION

Uppercase conversion changes letters to capital form.

Lowercase conversion changes letters to small form.

Toggle case switches uppercase to lowercase and vice versa.

Manual conversion uses ASCII differences.

FREQUENCY ANALYSIS

Frequency counts how many times an element appears.

Character frequency may not allow maps.

Word frequency uses nested loops.

Used to find most and least frequent elements.

DUPLICATES AND UNIQUENESS

Duplicate characters appear more than once.

Duplicate words repeat in sentence.

First repeating character is earliest duplicate.

First non-repeating character appears only once.

Visited markers or nested loops are used.

LOGICAL STRING PROBLEMS

Anagrams require same length and same character count.

Rotation check uses concatenation logic.

Pangram contains all 26 alphabets.

Unique character string has no repetition.

SUBSTRING OPERATIONS

Substring is a continuous part of a string.

Nested loops are used to generate substrings.

Substring counting checks repeated patterns.

Unique substrings require duplicate avoidance.

VALIDATION PROBLEMS

Identifier validation follows naming rules.

Email validation checks basic structure.

Phone number validation checks digit count.

Numeric validation checks digits and signs.

Date validation checks format and separators.

Parentheses validation uses counter logic.

NUMERIC STRING PROCESSING

Digits can be extracted from mixed strings.

Digit sum adds all numeric characters.

Manual string-to-int conversion avoids parsing functions.

Sign handling is required for negative numbers.

Int-to-string conversion builds characters manually.

ENCODING AND DECODING

Caesar cipher shifts characters by fixed value.

Decryption reverses the shift.

Run-length encoding compresses consecutive characters.

Decoding expands compressed strings.

ADVANCED STRING LOGIC

Longest repeating character run finds max sequence.

Smallest vowel window uses sliding window logic.

Compress consecutive duplicates reduces size.

Reverse-only-letters keeps digits fixed.

Prefix and suffix matching compares multiple strings.

MINI PROGRAMS

Menu-driven programs combine multiple string operations.

Text analyzer performs multiple analyses on input.

String lab provides interactive string operations.

Typing accuracy compares expected vs typed text.

String toolkit integrates all learned concepts.
